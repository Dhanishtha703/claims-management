FROM openjdk:17-alpine
EXPOSE 8001
COPY target/claim-authservice-repo.jar claim-authservice-repo.jar
ENTRYPOINT ["java","-jar","/claim-authservice-repo.jar"]