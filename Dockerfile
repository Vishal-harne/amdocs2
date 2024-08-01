FROM openjdk:17
EXPOSE 8081
ADD target/visal.jar visal.jar
ENTRYPOINT ["java", "-jar", "/visal.jar"]