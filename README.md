# 🏥 CitaChao Backend

Backend desarrollado para el proyecto académico **CitaChao** del curso **Soluciones Web y Aplicaciones Distribuidas** de la Universidad Privada del Norte (UPN).

## 📌 Descripción

CitaChao es un sistema de gestión de citas médicas que permite administrar:

- Especialidades médicas
- Médicos
- Citas médicas

La aplicación fue desarrollada utilizando Spring Boot, PostgreSQL y Spring Data JPA, siguiendo una arquitectura por capas basada en Controller, Service, Repository y Entity.

---

## 🚀 Tecnologías Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Maven
- PostgreSQL 16
- Lombok
- Postman
- GitHub

---

## 📂 Arquitectura

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

---

## 📁 Estructura del Proyecto

```text
src/main/java/pe/upn/citachao

├── controller
│   ├── CitaController.java
│   ├── EspecialidadController.java
│   └── MedicoController.java
│
├── entity
│   ├── Cita.java
│   ├── Especialidad.java
│   └── Medico.java
│
├── repository
│   ├── CitaRepository.java
│   ├── EspecialidadRepository.java
│   └── MedicoRepository.java
│
├── service
│   ├── CitaService.java
│   ├── EspecialidadService.java
│   └── MedicoService.java
│
└── CitachaoApplication.java
```

---

## 🗄️ Modelo de Datos

```text
Especialidad (1)
        │
        │
        ▼
Medico (N)

Medico (1)
        │
        │
        ▼
Cita (N)
```

### Especialidad

| Campo | Tipo |
|---------|---------|
| id | Long |
| nombre | String |

### Medico

| Campo | Tipo |
|---------|---------|
| id | Long |
| nombre | String |
| especialidad_id | FK |

### Cita

| Campo | Tipo |
|---------|---------|
| id | Long |
| paciente | String |
| fecha | String |
| hora | String |
| medico_id | FK |

---

## ⚙️ Configuración de Base de Datos

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/citachao
spring.datasource.username=postgres
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

---

## 🌐 Endpoints REST

### Especialidades

#### Obtener especialidades

```http
GET /api/especialidades
```

#### Registrar especialidad

```http
POST /api/especialidades
```

Body:

```json
{
  "nombre": "Cardiología"
}
```

---

### Médicos

#### Obtener médicos

```http
GET /api/medicos
```

#### Registrar médico

```http
POST /api/medicos
```

Body:

```json
{
  "nombre": "Dr. Juan Perez",
  "especialidad": {
    "id": 1
  }
}
```

---

### Citas

#### Obtener citas

```http
GET /api/citas
```

#### Registrar cita

```http
POST /api/citas
```

Body:

```json
{
  "paciente": "Luis García",
  "fecha": "2026-12-01",
  "hora": "09:00",
  "medico": {
    "id": 1
  }
}
```

#### Eliminar cita

```http
DELETE /api/citas/{id}
```

---

## ✅ Validaciones Implementadas

Antes de registrar una cita médica se valida que el nombre del paciente no esté vacío.

```java
if(cita.getPaciente() == null ||
   cita.getPaciente().isBlank()) {

    throw new RuntimeException(
        "El nombre del paciente es obligatorio");
}
```

---

## 🧪 Pruebas

Las pruebas fueron realizadas utilizando Postman para verificar:

- Registro de especialidades.
- Registro de médicos.
- Registro de citas.
- Consulta de información.
- Eliminación de citas.
- Validaciones de negocio.

---

## 📸 Evidencias

### Estructura del Proyecto

_Agregar captura del proyecto en VS Code._

### Base de Datos PostgreSQL

_Agregar captura de las tablas y relaciones._

### Pruebas en Postman

_Agregar capturas de GET, POST y DELETE._

---

## 🔗 Repositorio

```text
https://github.com/Dzhonx/citachao-backend
```

---

## 👨‍💻 Autor

**Dzhonx**

Proyecto desarrollado para el curso:

**Soluciones Web y Aplicaciones Distribuidas**  
**Universidad Privada del Norte - UPN**
