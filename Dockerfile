# Dockerfile
FROM openjdk:17-alpine

MAINTAINER "gattaca"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} base-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/base-0.0.1-SNAPSHOT.jar"]