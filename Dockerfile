# 1️⃣ Build Stage
FROM gradle:8.2.1-jdk17 AS builder
WORKDIR /app

# Copy Gradle files first
COPY build.gradle settings.gradle ./
COPY gradle gradle
COPY gradlew ./
RUN chmod +x gradlew

# Copy source code
COPY src src

# Build the project (creates the jar)
RUN ./gradlew clean bootJar --no-daemon

# 2️⃣ Runtime Stage
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
