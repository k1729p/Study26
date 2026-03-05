FROM maven:3.9.11-eclipse-temurin-25 AS maven_tool
COPY first/src /tmp/first/src
COPY pom.xml /tmp/
COPY first/pom.xml /tmp/first/pom.xml
COPY second/pom.xml /tmp/second/pom.xml
COPY third/pom.xml /tmp/third/pom.xml
WORKDIR /tmp/
RUN mvn --quiet --projects first clean package

FROM eclipse-temurin:25
COPY --from=maven_tool /tmp/first/target/Study26-first-1.0.0-SNAPSHOT.jar application.jar
ENTRYPOINT ["java","--enable-native-access=ALL-UNNAMED","--sun-misc-unsafe-memory-access=allow","-jar","application.jar"]