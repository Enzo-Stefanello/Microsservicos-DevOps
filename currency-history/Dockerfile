FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/currency-history-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8101

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
