FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
WORKDIR /usr/app
COPY ${JAR_FILE} ./
ENTRYPOINT ["java","-jar","app.jar"]
