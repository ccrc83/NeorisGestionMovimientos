# Dockerfile
FROM openjdk:17-alpine

# Copy the JAR file to the container
COPY out/artifacts/countries_jar/*.jar .

# Set the entrypoint command
ENTRYPOINT ["java", "-jar", "countries.jar"]