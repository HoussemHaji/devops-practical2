FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/bonjour-app-0.0.1-SNAPSHOT.jar /app/bonjour-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "bonjour-app.jar"]
