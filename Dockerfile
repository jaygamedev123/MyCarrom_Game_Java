FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /app
# Copy JAR file into container
COPY target/gamestriker-0.0.1-SNAPSHOT.jar app.jar
# Expose application port
EXPOSE 8080
# Set the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]