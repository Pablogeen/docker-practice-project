FROM amazoncorretto:21
WORKDIR /app
COPY target/FirstApp-0.0.1-SNAPSHOT.jar FirstApp.jar
EXPOSE 9001
ENTRYPOINT ["java", "-jar", "FirstApp.jar"]