FROM maven:3.8.1-openjdk-17-slim AS build

COPY pom.xml /usr/src/app/
RUN mvn -f /usr/src/app/pom.xml dependency:go-offline

COPY src /usr/src/app/src
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:17-slim

COPY --from=build /usr/src/app/target/*.jar /usr/app/app.jar

EXPOSE 8080

ENV MONGO_URL=mongodb://mongo:27017/mydatabase
ENV MONGO_USERNAME=root
ENV MONGO_PASSWORD=example

ENTRYPOINT ["java","-jar","/usr/app/app.jar"]