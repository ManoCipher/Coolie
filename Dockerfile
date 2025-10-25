# Use official OpenJDK image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy built jar file into image
COPY build/libs/*.jar app.jar

# Expose your backend port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
