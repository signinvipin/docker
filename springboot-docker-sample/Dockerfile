# This is a sample file to create a docker image 
# from dockerfile instructions.

# Use the java development alpine docker image
From alpine:latest

# Update the repository of OS and add bash to it
RUN apk update && apk add bash openjdk19-jre

WORKDIR /app

COPY /target/docker-java-app-example.jar /app

EXPOSE 8080

CMD ["java", "-jar", "docker-java-app-example.jar"]