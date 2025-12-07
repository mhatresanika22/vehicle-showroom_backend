# Use lightweight Java runtime
FROM eclipse-temurin:17-jre

# App directory
WORKDIR /app

# Copy ANY jar file from repo and rename to app.jar
COPY *.jar app.jar

# Expose Render port
ENV PORT=8080
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]