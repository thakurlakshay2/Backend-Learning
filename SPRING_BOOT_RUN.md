# Run the Spring Boot examples

This project now has one clear way to study the examples:

1. Spring Boot web app: exposes the bad and good ideas through HTTP endpoints.

## Run the Spring Boot app

From the project root:

```bash
cd /Users/lakshay/Desktop/learning/Videos/Backend-Learning
mvn spring-boot:run
```

Then open these URLs in your browser or use curl:

- http://localhost:8080/users/bad/1
- http://localhost:8080/users/good/1
- http://localhost:8080/users/register?password=hello123
- http://localhost:8080/users/bad-status
- http://localhost:8080/users/good-status

## Project structure

- src/main/java/com/example/phase0/Phase0Application.java
  - Spring Boot entrypoint
- src/main/java/com/example/phase0/controller/
  - controllers / API endpoints
- src/main/java/com/example/phase0/service/
  - business logic
- src/main/java/com/example/phase0/model/
  - domain entities
- src/main/java/com/example/phase0/dto/
  - DTOs for safe responses
