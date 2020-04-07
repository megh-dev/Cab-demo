FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
WORKDIR /usr/app
COPY . .
ENTRYPOINT ["java","-jar","/cabmanagement-0.0.1-SNAPSHOT.jar"]
