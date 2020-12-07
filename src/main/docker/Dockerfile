FROM java:8
LABEL maintainer="chasungsoo@github.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/a9-api-server-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} a9-api-server.jar
ENTRYPOINT ["java","-jar","/a9-api-server.jar"]