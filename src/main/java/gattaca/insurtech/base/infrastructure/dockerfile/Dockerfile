FROM adoptopenjdk:17-jre-hotspot

ARG JAR_FILE=target/*.jar

COPY target/*.jar countries.jar

EXPOSE 8080

# RUN apt-get update && apt-get install -y <dependencias>

CMD java -jar countries.jar