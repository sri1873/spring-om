FROM openjdk:11
EXPOSE 9004
ADD target/om-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jar" ]