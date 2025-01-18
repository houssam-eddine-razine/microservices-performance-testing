# Dockerfile for serservice-client-feign
FROM openjdk:21-slim
VOLUME /tmp
ARG JAR_FILE=target/serservice-client-feign-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8084
