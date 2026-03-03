# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build
LABEL authors="suph03"
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/temconverter-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]