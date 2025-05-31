package kp.services.servers;

import io.grpc.internal.testing.StreamRecorder;
import io.grpc.stub.StreamObserver;
import kp.proto.WordNote;
import org.assertj.core.api.Fail;
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
 * Unit tests for the {@link WordsChatServiceGrpcImpl} class.
 * <p>
 * This class verifies correct bidirectional streaming behavior for word notes using gRPC.
 * </p>
 */
@SpringBootTest
class WordsChatServiceGrpcImplTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());
    private final WordsChatServiceGrpcImpl wordsChatServiceGrpc;
    /**
     * Test input: a list of words to be sent as requests.
     */
    private static final List<String> REQUEST_WORDS = List.of("abc", "klm", "wxy");
    /**
     * Expected output: a list of words to be received as response.
     */
    private static final List<String> RESPONSE_WORDS = List.of("bcd", "lmn", "xyz");

    /**
     * Parameterized constructor.
     *
     * @param wordsChatServiceGrpc the {@link WordsChatServiceGrpcImpl} instance
     */
    WordsChatServiceGrpcImplTest(@Autowired WordsChatServiceGrpcImpl wordsChatServiceGrpc) {
        this.wordsChatServiceGrpc = wordsChatServiceGrpc;
    }

    /**
     * Verifies the word chat functionality via a gRPC stream.
     * <ul>
     *     <li>Sends a sequence of words to the service.</li>
     *     <li>Asserts that each response is changed.</li>
     *     <li>Ensures the stream completes successfully within a timeout.</li>
     * </ul>
     *
     * @throws Exception if the stream does not complete as expected
     */
    @Test
    @DisplayName("🟩 should chat with words")
    void shouldChatWithWords() throws Exception {
        // GIVEN
        final StreamRecorder<WordNote> streamRecorder = StreamRecorder.create();
        // WHEN
        final StreamObserver<WordNote> streamObserver = wordsChatServiceGrpc.wordsChat(streamRecorder);
        REQUEST_WORDS.forEach(word -> streamObserver.onNext(WordNote.newBuilder().setWord(word).build()));
        streamObserver.onCompleted();
        // THEN
        if (!streamRecorder.awaitCompletion(5, TimeUnit.SECONDS)) {
            Fail.fail("The call did not terminate in time");
        }
        Assertions.assertNull(streamRecorder.getError(), "The stream terminating error");
        final List<WordNote> results = streamRecorder.getValues();
        Assertions.assertEquals(RESPONSE_WORDS.size(), results.size(), "The number of received values");
        for (int i = 0; i < results.size(); i++) {
            Assertions.assertEquals(RESPONSE_WORDS.get(i), results.get(i).getWord(),
                    "The response word from chat");
        }
        logger.info("shouldChatWithWords():");
    }
}
