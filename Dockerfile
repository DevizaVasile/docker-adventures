
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM openjdk:14-jdk-alpine
VOLUME /tmp
EXPOSE 8081
COPY --from=build /home/app/target/web-1.jar springbootpostgresqldocker_2.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springbootpostgresqldocker_2.jar"]

