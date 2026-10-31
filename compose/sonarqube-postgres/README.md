# sonarqube-postgres

SonarQube with a PostgreSQL database, run with Docker Compose.

```bash
cp .env.example .env     # then set DB_PASSWORD in .env
docker compose up -d
```
SonarQube is then available at `http://localhost:9001`.
