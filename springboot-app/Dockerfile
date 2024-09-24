# Imagen de maven
FROM maven:3.8.7-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# Imagen de java
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/KeycloakDockerJava-1.0-SNAPSHOT.jar /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
