FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/cabmanagement-0.0.1-SNAPSHOT.jar cabmanagement-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","cabmanagement-0.0.1-SNAPSHOT.jar"]
