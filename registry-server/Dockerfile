FROM openjdk:19
EXPOSE 8761
ADD target/registry-server.jar registry-server.jar
ENTRYPOINT ["java","-jar","/registry-server.jar"]
