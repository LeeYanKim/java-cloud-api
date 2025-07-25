# Use a lightweight JDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and project files
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Make the wrapper executable
RUN chmod +x mvnw

# Build the application (skip tests for speed)
RUN ./mvnw clean package -DskipTests

# Copy the produced JAR into place
RUN cp target/*.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Run the application (fixed path)
ENTRYPOINT ["java", "-jar", "app.jar"]
