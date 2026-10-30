# Demo Spring Boot

## ES - Español

Este proyecto es una pequeña API REST desarrollada con Spring Boot 3 / Java 21 y WebFlux. Su objetivo es servir como base de aprendizaje para empezar a crear aplicaciones Java con arquitectura ligera y endpoints HTTP simples.

### Características principales
- Proyecto Maven con Spring Boot
- Java 21
- Spring WebFlux
- Endpoint REST para saludar
- Configuración mínima con `application.yaml`

### Estructura del proyecto

```text
demo_springboot/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java
│   │   │       └── controller/
│   │   │           └── rest/
│   │   │               └── HelloResource.java
│   │   └── resources/
│   │       └── application.yaml
│   └── test/
├── .gitignore
├── .gitattributes
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

### Diagrama ASCII

```text
+----------------------+
|   Cliente / Navegador |
|   o Postman / curl   |
+----------+-----------+
           |
           v
+----------------------+
|   Spring Boot App    |
|   DemoApplication    |
+----------+-----------+
           |
           v
+----------------------+
|   HelloResource      |
|   /hello             |
|   /hello/demo/bye    |
+----------+-----------+
           |
           v
+----------------------+
|   application.yaml   |
|   Configuración      |
+----------------------+
```

### Requisitos
- Java 21
- Maven o Maven Wrapper (`./mvnw`)
- Git

### Cómo ejecutar

```bash
./mvnw clean install
./mvnw spring-boot:run
```

### Endpoints disponibles

```text
GET /hello?name=Emma
GET /hello/demo/bye
```

Ejemplo:

```bash
curl "http://localhost:8080/hello?name=Emma"
curl http://localhost:8080/hello/demo/bye
```

Respuesta esperada:

```text
Hello Emma!
```

---

## EN - English

This project is a small REST API built with Spring Boot 3 and Java 21 using WebFlux. It is intended as a lightweight starter project to learn how to create Java applications with simple HTTP endpoints.

### Main features
- Maven-based Spring Boot project
- Java 21
- Spring WebFlux
- REST endpoint for greetings
- Minimal configuration in `application.yaml`

### Project structure

```text
demo_springboot/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java
│   │   │       └── controller/
│   │   │           └── rest/
│   │   │               └── HelloResource.java
│   │   └── resources/
│   │       └── application.yaml
│   └── test/
├── .gitignore
├── .gitattributes
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

### ASCII diagram

```text
+----------------------+
|   Client / Browser   |
|   or Postman / curl  |
+----------+-----------+
           |
           v
+----------------------+
|   Spring Boot App    |
|   DemoApplication    |
+----------+-----------+
           |
           v
+----------------------+
|   HelloResource      |
|   /hello             |
|   /hello/demo/bye    |
+----------+-----------+
           |
           v
+----------------------+
|   application.yaml   |
|   Configuration      |
+----------------------+
```

### Requirements
- Java 21
- Maven or Maven Wrapper (`./mvnw`)
- Git

### Run the project

```bash
./mvnw clean install
./mvnw spring-boot:run
```

### Available endpoints

```text
GET /hello?name=Emma
GET /hello/demo/bye
```

Example:

```bash
curl "http://localhost:8080/hello?name=Emma"
curl http://localhost:8080/hello/demo/bye
```

Expected response:

```text
Hello Emma!
```

---

## CA - Català

Aquest projecte és una petita API REST desenvolupada amb Spring Boot 3 i Java 21 amb WebFlux. Està pensat com a base de pràctica per aprendre a crear aplicacions Java amb endpoints HTTP senzills i una estructura mínima.

### Funcionalitats principals
- Projecte Maven amb Spring Boot
- Java 21
- Spring WebFlux
- Endpoint REST per saludar
- Configuració mínima a `application.yaml`

### Estructura del projecte

```text
demo_springboot/
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── DemoApplication.java
│   │   │       └── controller/
│   │   │           └── rest/
│   │   │               └── HelloResource.java
│   │   └── resources/
│   │       └── application.yaml
│   └── test/
├── .gitignore
├── .gitattributes
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

### Diagrama ASCII

```text
+----------------------+
|   Client / Navegador |
|   o Postman / curl   |
+----------+-----------+
           |
           v
+----------------------+
|   Spring Boot App    |
|   DemoApplication    |
+----------+-----------+
           |
           v
+----------------------+
|   HelloResource      |
|   /hello             |
|   /hello/demo/bye    |
+----------+-----------+
           |
           v
+----------------------+
|   application.yaml   |
|   Configuració      |
+----------------------+
```

### Requisits
- Java 21
- Maven o Maven Wrapper (`./mvnw`)
- Git

### Com executar-lo

```bash
./mvnw clean install
./mvnw spring-boot:run
```

### Endpoints disponibles

```text
GET /hello?name=Emma
GET /hello/demo/bye
```

Exemple:

```bash
curl "http://localhost:8080/hello?name=Emma"
curl http://localhost:8080/hello/demo/bye
```

Resposta esperada:

```text
Hello Emma!
```

---

## Resumen general / Summary / Resum

Este proyecto es un ejemplo básico de una aplicación Spring Boot con WebFlux, orientada a aprender la estructura de una app Java y a probar endpoints REST en un entorno sencillo.

This project is a basic example of a Spring Boot application with WebFlux, designed to learn the structure of a Java app and to test REST endpoints in a simple environment.

Aquest projecte és un exemple bàsic d'una aplicació Spring Boot amb WebFlux, pensat per aprendre l'estructura d'una app Java i provar endpoints REST en un entorn senzill.

### Autor / Author / Autor
Emma Choquesandoval

### Licencia
Este proyecto se entrega como ejemplo educativo sin licencia específica.
This project is provided as an educational example without a specific license.
Aquest projecte es lliura com a exemple educatiu sense llicència específica.
