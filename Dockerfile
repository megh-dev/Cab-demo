FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY . /app
ENTRYPOINT ["java","-jar","/cabmanagement-0.0.1-SNAPSHOT.jar"]
