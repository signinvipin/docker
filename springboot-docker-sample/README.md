# springboot-docker-sample

A small Spring Boot web app used to practice building a Docker image.

## Build and run
```bash
mvn clean package            # builds target/docker-java-app-example.jar
docker build -t docker-java-app-example .
docker run -d -p 8080:8080 docker-java-app-example
```
Then open `http://localhost:8080/`.

## Files
- `Dockerfile`: Alpine with an OpenJDK 19 JRE; copies the built JAR and runs it
- `pom.xml`, `src/`: the Spring Boot app

The `target/` folder is build output and is not committed.
