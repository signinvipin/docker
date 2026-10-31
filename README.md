# docker

Docker CLI notes, Docker Compose examples, a Spring Boot image and a Kubernetes deployment manifest.

## Contents
| Folder | What it covers |
|---|---|
| [notes](./notes) | Docker CLI commands: running, listing, stopping and entering containers; building an image by hand and from a Dockerfile |
| [compose](./compose) | Docker Compose notes and examples |
| [compose/hello-world-hits](./compose/hello-world-hits) | Flask app with a Redis hit counter, using `include:` and `compose watch` |
| [compose/sonarqube-postgres](./compose/sonarqube-postgres) | SonarQube and PostgreSQL stack |
| [springboot-docker-sample](./springboot-docker-sample) | Spring Boot app packaged into an image with a Dockerfile |
| [kubernetes](./kubernetes) | Example Deployment manifest for an nginx image |

## Structure
```text
.
├── notes/docker-commands.txt
├── compose/
│   ├── compose-commands.txt
│   ├── compose-file-references.txt
│   ├── hello-world-hits/
│   └── sonarqube-postgres/
├── kubernetes/nginx-deployment.yml
└── springboot-docker-sample/
```

## Notes
- Passwords come from a `.env` file (see the `.env.example` in `compose/sonarqube-postgres`). Never commit a real `.env`.
- Build output (`target/`) is not committed. Build the Spring Boot app with `mvn clean package` before building its image.
