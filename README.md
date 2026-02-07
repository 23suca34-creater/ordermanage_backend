# Hardware Management System - Backend

Spring Boot backend for the Hardware Order Management System. It provides REST APIs for products and orders and uses an H2 file-based database for persistence.

## Features

- RESTful APIs for products and orders
- H2 file-based persistent storage
- Spring Boot 4.1.0-M1 with Java 17
- Maven build

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Project Structure

```
hardware-management/
├── src/main/java/com/example/hardware_management/
│   ├── controller/
│   ├── dto/
│   ├── entity/
│   ├── repository/
│   └── service/
├── src/main/resources/
│   ├── application.properties
│   └── data.sql
├── Dockerfile
└── pom.xml
```

## Run Locally

### Build

```bash
./mvnw clean package
```

### Run

```bash
./mvnw spring-boot:run
```

By default, the API runs on `http://localhost:8080`.

## Docker

### Build Image

```bash
docker build -t hardware-management-backend .
```

### Run Container

```bash
docker run -p 8080:8080 hardware-management-backend
```

## Docker Image Screenshot

![Docker Image](./screenshot/Screenshot%20(261).png)
![Render Image](./screenshot/Screenshot%20(263).png)

