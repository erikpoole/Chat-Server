FROM java:9
WORKDIR /
ADD target/hwBasicHTTPServer-0.0.1-SNAPSHOT.jar ChatServer.jar
ADD Resources/ Resources/
EXPOSE 8080
CMD java -jar ChatServer.jar