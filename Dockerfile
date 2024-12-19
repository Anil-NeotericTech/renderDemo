FROM maven:3.9.8-amazoncorretto-17-al2023 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests



FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/renderDemo-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"app.jar"]

