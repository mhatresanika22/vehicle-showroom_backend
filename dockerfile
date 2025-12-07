# Dockerfile
# Stage 1: build with Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# copy pom and download dependencies (speeds up rebuilds)
COPY pom.xml ./
# if you have .mvn wrapper or .mvn directory uncomment below
# COPY .mvn .mvn
RUN mvn -B dependency:go-offline -DskipTests

# copy source and build
COPY src ./src
RUN mvn -B package -DskipTests -DskipUTs

# Stage 2: run the app on a lightweight JRE
FROM eclipse-temurin:17-jre
WORKDIR /app

# copy jar produced in build stage
COPY --from=build /app/target/*.jar app.jar

# recommended JVM options can be passed via env or compose if needed
ENTRYPOINT ["java", "-jar", "/app.jar"]
