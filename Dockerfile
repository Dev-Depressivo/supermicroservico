# Use Java 17
FROM amazoncorretto:17.0.5

COPY build/libs/*.jar supermicroservico.jar

ENTRYPOINT java -jar supermicroservico.jar