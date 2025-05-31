<!DOCTYPE html>
<html lang="en">
<meta charset="UTF-8">
<body>
<a href="https://github.com/k1729p/Study26/tree/main/docs">
    <img alt="" src="images/ColorScheme.png" height="25" width="800"/>
</a>
<h2 id="contents">Study26 README Contents</h2>

<h3 id="top">Research <a href="https://grpc.io/docs/what-is-grpc/introduction/">gRPC</a></h3>

<img src="images/MermaidFlowchartDiagram.png" height="650" width="760" alt=""/>

<p>
    Project sections:
</p>
<ol>
    <li><a href="#ONE"><b>Business Logic</b></a></li>
    <li><a href="#TWO"><b>Docker Build</b></a></li>
    <li><a href="#THREE"><b>Curl Clients to Docker</b></a></li>
    <li><a href="#FOUR"><b>Curl Clients to Local</b></a></li>
</ol>

<p>
    Java source code packages:<br>
    <img alt="" src="images/aquaHR-500.png"><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-first', application sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/first/src/main/java/kp">kp</a><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-first', test sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/first/src/test/java/kp">kp</a><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-second', application sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/second/src/main/java/kp">kp</a><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-second', test sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/second/src/test/java/kp">kp</a><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-third', application sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/third/src/main/java/kp">kp</a><br>
    <img alt="" src="images/aquaSquare.png">
    <i>project 'Study26-third', test sources</i>&nbsp;:&nbsp;
    <a href="https://github.com/k1729p/Study26/tree/main/third/src/test/java/kp">kp</a><br>
    <img alt="" src="images/aquaHR-500.png">
</p>

<p>
    <img alt="" src="images/yellowHR-500.png"><br>
    <img alt="" src="images/yellowSquare.png">
    <i>project 'Study26-first'</i>&nbsp;:&nbsp;
    <a href="https://htmlpreview.github.io/?https://github.com/k1729p/Study26/blob/main/first/docs/apidocs/overview-tree.html">
        Java API Documentation</a><br>
    <img alt="" src="images/yellowSquare.png">
    <i>project 'Study26-second'</i>&nbsp;:&nbsp;
    <a href="https://htmlpreview.github.io/?https://github.com/k1729p/Study26/blob/main/second/docs/apidocs/overview-tree.html">
        Java API Documentation</a><br>
    <img alt="" src="images/yellowSquare.png">
    <i>project 'Study26-third'</i>&nbsp;:&nbsp;
    <a href="https://htmlpreview.github.io/?https://github.com/k1729p/Study26/blob/main/third/docs/apidocs/overview-tree.html">
        Java API Documentation</a><br>
    <img alt="" src="images/yellowHR-500.png">
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="ONE">❶ Business Logic</h3>
<p><img  alt="" src="images/greenCircle.png">
    1.1. Protocol Buffers are language-neutral, platform-neutral, extensible mechanisms
    for serializing structured data. Google Protocol Buffer (protobuf) is a binary data format.
    The gRPC API is based on Protocol Buffers, which provides a protoc compiler to generate code.
</p>
<p><img  alt="" src="images/greenCircle.png">
    1.2. The Protocol Buffers <b>proto</b> definitions. The Java code is generated from the <b>proto</b> files.
</p>
<table style="border:solid"><tbody>
<tr>
    <td style="border:solid">
        <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/proto/chat.proto">
            chat.proto</a>
    </td><td style="border:solid">
        <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/proto/department.proto">
            department.proto</a></td>
</tr>
</tbody></table>

<p><img alt="" src="images/greenCircle.png">
    1.3. Find all departments.
</p>
<img src="images/MermaidSequenceDiagram1.png" height="705" width="815" alt=""/>
<p>
    The REST endpoint <code>/departments</code> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/controllers/DepartmentController.java#L44">
    <code>kp.controllers.DepartmentController::getDepartments</code></a>
    is the entry point for retrieving all departments. It handles HTTP requests and delegates the retrieval logic to the gRPC client service.
</p>
<p>
    The gRPC <b>client service</b> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/services/clients/DepartmentService.java#L37">
    <code>kp.services.clients.DepartmentService::getDepartments</code></a>
    uses a gRPC blocking stub to communicate with the department service on the <b>"Second"</b> application, calling its gRPC endpoint to retrieve all departments.
</p>
<p>
    The gRPC <b>server endpoint</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/servers/DepartmentServiceGrpcImpl.java#L39">
    <code>kp.services.servers.DepartmentServiceGrpcImpl::getDepartments</code></a>
    is the gRPC implementation that handles requests from the client, fetches the departments from a service,
    and returns them to the client.
</p>
<p>
    The gRPC <b>client service</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/clients/DepartmentService.java#L37">
    <code>kp.services.clients.DepartmentService::getDepartments</code></a>
    fetches departments from the service in the <b>"Third"</b> application.
</p>
<p>
    The gRPC <b>server endpoint</b> in the Spring Boot application <b>"Third"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/third/src/main/java/kp/services/servers/DepartmentServiceGrpcImpl.java#L29">
    <code>kp.services.servers.DepartmentServiceGrpcImpl::getDepartments</code></a>
    is the final gRPC server implementation, which stores the list of departments and provides them to upstream callers.
</p>

<p><img alt="" src="images/greenCircle.png">
    1.4. Find department by id.
</p>
<img src="images/MermaidSequenceDiagram2.png" height="705" width="815" alt=""/>
<p>
    The REST endpoint <code>/departments/{id}</code> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/controllers/DepartmentController.java#L61">
    <code>kp.controllers.DepartmentController::getDepartmentById</code></a>
    is the entry point for retrieving a department by its id. It delegates the lookup to the gRPC client service.
</p>
<p>
    The gRPC <b>client service</b> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/services/clients/DepartmentService.java#L53">
    <code>kp.services.clients.DepartmentService::getDepartmentById</code></a>
    sends a gRPC request to the department service on the <b>"Second"</b> application,
    requesting a department with the specified id.
</p>
<p>
    The gRPC <b>server endpoint</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/servers/DepartmentServiceGrpcImpl.java#L61">
    <code>kp.services.servers.DepartmentServiceGrpcImpl::getDepartmentById</code></a>
    handles the request, performs the lookup via a service, and returns the department to the client,
    or an error if not found.
</p>
<p>
    The gRPC <b>client service</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/clients/DepartmentService.java#L53">
    <code>kp.services.clients.DepartmentService::getDepartmentById</code></a>
    enables the <b>"Second"</b> application to act as a gRPC client itself (e.g., to forward lookups to the <b>"Third"</b> application).
</p>
<p>
    The gRPC <b>server endpoint</b> in the Spring Boot application <b>"Third"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/third/src/main/java/kp/services/servers/DepartmentServiceGrpcImpl.java#L45">
    <code>kp.services.servers.DepartmentServiceGrpcImpl::getDepartmentById</code></a>
    is the final backend handler that provides the department details for a given id, or an error if not found.
</p>

<p><img  alt="" src="images/greenCircle.png">
    1.5. Chat services.<br>
    gRPC uses the HTTP/2 network protocol. This protocol supports streams.
    In these two chat services, bidirectional streaming RPC is implemented,
    where both sides send a sequence of messages using a read-write stream.
</p>

<p><img  alt="" src="images/greenCircle.png">
    1.6. Chat with numbers.
</p>
<img src="images/MermaidSequenceDiagram3.png " height="750" width="625" alt=""/>
<p>
    The REST endpoint <code>/numbers/{limit}</code> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/controllers/ChatController.java#L46">
    <code>kp.controllers.ChatController::startNumbersChat</code></a>
    is a REST controller method that acts as the entry point for initiating the numbers chat session.
    When this endpoint is called, it triggers the gRPC client logic to start the bidirectional number exchange with the server,
    using the provided <code>limit</code> as the upper bound for the exchange.
</p>
<p>
    The service with the gRPC <b>client</b> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/services/clients/NumbersChatService.java#L101">
    <code>kp.services.clients.NumbersChatService::runNumbersChat</code></a>
    is a private helper method that handles the bidirectional number exchange logic with the gRPC server.
    It sends and receives numbers using a <code>StreamObserver</code>, incrementing each value until the specified limit is reached.
    This method is invoked internally by <code>startNumbersChat(int limit)</code>, which acts as the public entry point for initiating the gRPC chat session.
</p>
<p>
    The service with the gRPC <b>server</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/servers/NumbersChatServiceGrpcImpl.java#L32">
    <code>kp.services.servers.NumbersChatServiceGrpcImpl::numbersChat</code></a>
    is the public gRPC endpoint that implements the bidirectional streaming RPC.
    It returns a <code>StreamObserver</code> for handling incoming <code>NumberNote</code> messages from the client,
    incrementing each received number and sending it back to the client.
</p>
<p><img  alt="" src="images/greenCircle.png">
    1.7. Chat with words.
</p>
<img src="images/MermaidSequenceDiagram4.png " height="750" width="625" alt=""/>
<p>
    The REST endpoint <code>/words/{limit}</code> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/controllers/ChatController.java#L60">
    <code>kp.controllers.ChatController::startWordsChat</code></a>
    is a REST controller method that acts as the entry point for initiating the words chat session.
    When this endpoint is called, it triggers the gRPC client logic to start the bidirectional word exchange with the server,
    using the provided <code>limit</code> as the upper bound for the exchange.
</p>
<p>
    The service with the gRPC <b>client</b> in the Spring Boot application <b>"First"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/first/src/main/java/kp/services/clients/WordsChatService.java#L109">
    <code>kp.services.clients.WordsChatServiceGrpcImpl::runWordsChat</code></a>
    is a private helper method that handles the bidirectional word exchange logic with the gRPC server.
    It sends and receives words using a <code>StreamObserver</code>, changing each value until the specified limit is reached.
    This method is invoked internally by <code>startWordsChat(int limit)</code>, which acts as the public entry point for initiating the gRPC chat session.
</p>
<p>
    The service with the gRPC <b>server</b> in the Spring Boot application <b>"Second"</b>:<br>
    The method <a href="https://github.com/k1729p/Study26/blob/main/second/src/main/java/kp/services/servers/WordsChatServiceGrpcImpl.java#L42">
    <code>kp.services.servers.WordsChatServiceGrpcImpl::wordsChat</code></a>
    is the public gRPC endpoint that implements the bidirectional streaming RPC.
    It returns a <code>StreamObserver</code> for handling incoming <code>WordNote</code> messages from the client,
    changing each received word and sending it back to the client.
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="TWO">❷ Docker Build</h3>

<p>Action:<br>
    <img  alt="" src="images/orangeHR-500.png"><br>
    <img  alt="" src="images/orangeSquare.png"> Use the batch file
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/01%20Docker%20compose.bat">
        <i>"01 Docker compose.bat"</i></a> to build the images and start the containers.<br>
    <img  alt="" src="images/orangeHR-500.png">
</p>

<p><img  alt="" src="images/greenCircle.png">
    2.1. Docker images are built using the following files:
</p>
<ul>
    <li><a href="https://github.com/k1729p/Study26/blob/main/docker-config/First.Dockerfile">
        <b>"First.Dockerfile"</b></a></li>
    <li><a href="https://github.com/k1729p/Study26/blob/main/docker-config/Second.Dockerfile">
        <b>"Second.Dockerfile"</b></a></li>
    <li><a href="https://github.com/k1729p/Study26/blob/main/docker-config/Third.Dockerfile">
        <b>"Third.Dockerfile"</b></a></li>
    <li><a href="https://github.com/k1729p/Study26/blob/main/docker-config/compose.yaml">
        <b>"compose.yaml"</b></a></li>
</ul>

<p><img  alt="" src="images/greenCircle.png">
    2.2. The <a href="images/ScreenshotDockerContainers.png">screenshot</a>
    shows the created Docker containers.
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="THREE">❸ Curl Clients to Docker</h3>

<p>Action:<br>
    <img  alt="" src="images/orangeHR-500.png"><br>
    <img  alt="" src="images/orangeSquare.png">1. Start the Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/02%20CURL%20on%20Docker%20'departments'.bat">
        <i>"02 CURL on Docker 'departments'.bat"</i></a>.<br>
    <img  alt="" src="images/orangeSquare.png">2. Start the Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/03%20CURL%20on%20Docker%20'chat'.bat">
        <i>"03 CURL on Docker 'chat'.bat"</i></a>.<br>
    <img  alt="" src="images/orangeHR-500.png">
</p>

<p><img  alt="" src="images/greenCircle.png">
    3.1. Testing the <b>"departments"</b> endpoints. The Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/scripts/departments.bat"><i>"departments.bat"</i></a>.
</p>
<p>
    The <a href="images/ScreenshotCurlDepartments.png">screenshot</a>
    shows the  results from the batch file <i>"02 CURL on Docker 'departments'.bat"</i>.
</p>

<p><img  alt="" src="images/greenCircle.png">
    3.2. Testing the <b>"chat"</b> endpoints. The Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/scripts/chat.bat"><i>"chat.bat"</i></a>.
</p>
<p>
    <img src="images/ScreenshotCurlChatLocal.png" height="100" width="150" alt=""/><br>
    <img alt="" src="images/blackArrowUp.png">
    The screenshot shows the results from the batch file <i>"03 CURL on Docker 'chat'.bat"</i>.<br>
</p>
<p>
    The <a href="images/ScreenshotCurlChatFirst.png">screenshot</a>
    shows the logs in the Docker container <b>"First"</b>.<br>
    The <a href="images/ScreenshotCurlChatSecond.png">screenshot</a>
    shows the logs in the Docker container <b>"Second"</b>.
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3 id="FOUR">❹ Curl Clients to Local</h3>

<p>Action:<br>
    <img  alt="" src="images/orangeHR-500.png"><br>
    <img  alt="" src="images/orangeSquare.png">1. Use the batch file
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/04%20MVN%20build%20and%20start%20local.bat">
        <i>"04 MVN build and start local.bat"</i></a> to build and<br>
    <img  alt="" src="images/orangeSquare.png">
    &nbsp; start locally the applications: <b>"First"</b>, <b>"Second"</b>, and <b>"Third"</b>.<br>
    <img  alt="" src="images/orangeSquare.png">2. Start the Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/05%20CURL%20local%20'departments'.bat">
        <i>"05 CURL local 'departments'.bat"</i></a>.<br>
    <img  alt="" src="images/orangeSquare.png">3. Start the Windows batch script
    <a href="https://github.com/k1729p/Study26/blob/main/0_batch/06%20CURL%20local%20'chat'.bat">
        <i>"06 CURL local 'chat'.bat"</i></a>.<br>
    <img  alt="" src="images/orangeHR-500.png">
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<h3>Links</h3>
<ul>
    <li><a href="https://grpc-ecosystem.github.io/grpc-spring/en/">
        gRPC-Spring-Boot-Starter Documentation</a></li>
    <li><a href="https://grpc.io/docs/languages/java/">
        gRPC Documentation - Java</a></li>
    <li><a href="https://protobuf.dev/support/version-support/#java">
        Protocol Buffers Version Support - Java</a></li>
</ul>
<hr>
<h3>Acronyms</h3>
<table style="border:solid">
    <tbody>
    <tr><td style="border:solid"><b>gRPC</b></td><td style="border:solid">Google Remote Procedure Call</td></tr>
    <tr><td style="border:solid"><b>IDL</b></td><td style="border:solid">Interface Definition Language</td></tr>
    </tbody>
</table>
<a href="#top">Back to the top of the page</a>
<hr>
</body>
</html>