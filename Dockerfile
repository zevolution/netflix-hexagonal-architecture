FROM maven:3.8.1-openjdk-11 AS build
RUN mkdir /src
COPY . /src
WORKDIR /src
RUN mvn clean install

#-----------------------------------------------------#

FROM openjdk:11-jdk-slim-buster
ARG ADDITIONAL_OPTS
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}
EXPOSE 5005 8080 9090
RUN mkdir /app
COPY --from=build /src/target/*.jar /app/app.jar
ENTRYPOINT ["/bin/sh", "-c", "java ${ADDITIONAL_OPTS} -jar /app/app.jar"]