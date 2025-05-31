package kp.services.servers;

import io.grpc.internal.testing.StreamRecorder;
import io.grpc.stub.StreamObserver;
import kp.proto.NumberNote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Unit tests for the {@link NumbersChatServiceGrpcImpl} class.
 * <p>
 * This class verifies correct bidirectional streaming behavior for number notes using gRPC.
 * </p>
 */
@SpringBootTest
class NumbersChatServiceGrpcImplTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());
    private final NumbersChatServiceGrpcImpl numbersChatServiceGrpc;

    /**
     * Test input: A list of integers to be sent as requests.
     * The last value triggers an expected integer overflow.
     */
    private static final List<Integer> REQUEST_NUMBERS = List.of(
            Integer.MIN_VALUE, 0, 10, Integer.MAX_VALUE
    );
    /**
     * Expected output: Each value is incremented by one.
     * Integer overflow is handled as per Java semantics.
     */
    private static final List<Integer> RESPONSE_NUMBERS = List.of(
            Integer.MIN_VALUE + 1, 1, 11, Integer.MIN_VALUE // Integer.MAX_VALUE + 1 wraps to Integer.MIN_VALUE
    );

    /**
     * Parameterized constructor.
     *
     * @param numbersChatServiceGrpc the {@link NumbersChatServiceGrpcImpl} instance
     */
    @Autowired
    NumbersChatServiceGrpcImplTest(NumbersChatServiceGrpcImpl numbersChatServiceGrpc) {
        this.numbersChatServiceGrpc = numbersChatServiceGrpc;
    }

    /**
     * Verifies the number chat functionality via a gRPC stream.
     * <ul>
     *     <li>Sends a sequence of numbers to the service.</li>
     *     <li>Asserts that each response is incremented by one, with correct overflow behavior.</li>
     *     <li>Ensures the stream completes successfully within a timeout.</li>
     * </ul>
     *
     * @throws Exception if the stream does not complete as expected
     */
    @Test
    @DisplayName("🟩 should chat with numbers")
    void shouldChatWithNumbers() throws Exception {
        // GIVEN
        final StreamRecorder<NumberNote> streamRecorder = StreamRecorder.create();
        // WHEN
        final StreamObserver<NumberNote> streamObserver = numbersChatServiceGrpc.numbersChat(streamRecorder);
        REQUEST_NUMBERS.forEach(number -> streamObserver.onNext(NumberNote.newBuilder().setNumber(number).build()));
        streamObserver.onCompleted();
        // THEN
        if (!streamRecorder.awaitCompletion(5, TimeUnit.SECONDS)) {
            Assertions.fail("The call did not terminate in time");
        }
        Assertions.assertNull(streamRecorder.getError(), "The stream terminating error");
        final List<NumberNote> results = streamRecorder.getValues();
        Assertions.assertEquals(RESPONSE_NUMBERS.size(), results.size(), "The number of received values");
        for (int i = 0; i < results.size(); i++) {
            Assertions.assertEquals(RESPONSE_NUMBERS.get(i), results.get(i).getNumber(),
                    "The response number from chat");
        }
        logger.info("shouldChatWithNumbers():");
    }
}
