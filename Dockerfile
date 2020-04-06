FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Cab-demo.jar
ENTRYPOINT ["java","-jar","/Cab-demo.jar"]
