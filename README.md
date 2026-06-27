# RedNorte Eureka

Servidor de descubrimiento de servicios para la plataforma RedNorte.

## Responsabilidad

- Registro de instancias de microservicios.
- Descubrimiento dinamico para BFF y servicios internos.

## Requisitos

- Java 17
- Maven 3.9+

## Ejecucion local

```powershell
./mvnw spring-boot:run
```

Puerto esperado: 8761

Panel Eureka:

http://localhost:8761

## Verificacion rapida

1. Levantar Eureka.
2. Levantar ms-pacientes, ms-citas y bff.
3. Revisar en el panel que los servicios se registren correctamente.

## Pruebas

```powershell
./mvnw clean test
```

## Flujo de colaboracion

1. Documentar cambio de configuracion.
2. Validar impacto en registro/descubrimiento.
3. Adjuntar evidencia visual del panel si cambia el comportamiento.
