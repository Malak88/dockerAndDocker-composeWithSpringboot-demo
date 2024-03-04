FROM openjdk:17-jdk

WORKDIR /app

COPY target/testIntelij-1.0.0.jar /app/testintellij.jar

EXPOSE 8080

CMD ["java", "-jar", "testintellij.jar"]