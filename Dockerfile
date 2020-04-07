FROM openjdk:11-jre-slim
WORKDIR usr/app
ADD target/cabmanagement-0.0.1-SNAPSHOT.jar cabmanagement-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/cabmanagement-0.0.1-SNAPSHOT.jar"]
