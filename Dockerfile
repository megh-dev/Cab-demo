FROM openjdk:11-jre-slim
WORKDIR usr/app
COPY . .
EXPOSE 8080
ENTRYPOINT ["java","-jar","cabmanagement-0.0.1-SNAPSHOT.jar"]
