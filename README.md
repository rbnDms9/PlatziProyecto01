# PlatziProyecto01
Proyecto 01, aprendiendo.
Cambios desde Rama01

## Servicio REST Java

Este proyecto incluye un servicio REST mínimo con Java 21, Maven y Spring Boot.

### Requisitos

- JDK 21
- Maven 3.6.3 o superior

### Ejecutar

```bash
mvn spring-boot:run
```

Consulta `GET http://localhost:8080/api/saludo` para obtener:

```json
{"mensaje":"Hola, mundo!"}
```

### Pruebas y cobertura

Las pruebas usan JUnit 5 y Mockito (incluidos en `spring-boot-starter-test`). Ejecuta:

```bash
mvn verify
```

JaCoCo genera el reporte HTML de cobertura en `target/site/jacoco/index.html`.
