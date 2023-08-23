FROM eclipse-temurin:17
COPY target/demodocker.jar demodocker.jar
CMD ["java","-jar","demodocker.jar"]
