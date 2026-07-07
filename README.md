# JavaSpringAuthentication

Simple Spring Boot for JWT authentication with user registration and login.

# Overview
A minimal REST API that supports user registration and JWT-based authentication. Key components:

- Application entry: ApiApplication.java
- Security configuration: SecurityConfig.java
- Auth controller: AuthController.java
- Test endpoint: TestController.java
- Auth service: AuthService.java
- JWT utilities: JwtTokenProvider.java
- Application properties: application.properties
  
# Prerequisites
- JDK 17+ (or the version configured in the project)
- Gradle (wrapper included)
- Build & run
# Build
```
./gradlew clean build
```
```
./gradlew bootRun
```
# Endpoints

> #Register
``` 
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "username": "fakeuser",
    "email": "fakeuser@example.com",
    "password": "password123",
    "fullName": "Bobs Burgers"
  }'
```
> Login
```
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "username": "fakeuser",
    "password": "password123"
  }'
```
