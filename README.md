# Desafio_foro

Descripción
Este proyecto es una API RESTful para un foro, creada como parte del desafío de Alura. La aplicación permite a los usuarios registrarse, crear tópicos y gestionar discusiones.

Características
Registro de usuarios
Autenticación de usuarios
Creación, listado y eliminación de tópicos
Seguridad con Spring Security
Persistencia de datos con Spring Data JPA y H2 Database
Tecnologías Utilizadas
Java
Spring Boot
Spring Data JPA
Spring Security
H2 Database
Maven
Requisitos
JDK 11 o superior
Maven 3.6.0 o superior
Instalación y Ejecución
Clonar el Repositorio
sh
Copy code
git clone https://github.com/tuusuario/foro.git
cd foro
Configurar el Proyecto
Asegúrate de tener configurado Maven y JDK correctamente. Luego, instala las dependencias y construye el proyecto:

sh
Copy code
mvn clean install
Ejecutar la Aplicación
Puedes ejecutar la aplicación usando el siguiente comando:

sh
Copy code
mvn spring-boot:run
La aplicación estará disponible en http://localhost:8080.

Uso de la API
Registro de Usuarios
Endpoint: POST /usuarios/registrar

Cuerpo de la Solicitud:

json
Copy code
{
    "nombre": "Nombre de Usuario",
    "email": "usuario@ejemplo.com",
    "password": "contraseñaSegura"
}
Listar Tópicos
Endpoint: GET /topicos
Crear un Tópico
Endpoint: POST /topicos

Cuerpo de la Solicitud:

json
Copy code
{
    "titulo": "Título del Tópico",
    "mensaje": "Contenido del Tópico",
    "usuarioId": 1
}
Eliminar un Tópico
Endpoint: DELETE /topicos/{id}
Estructura del Proyecto
css
Copy code
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── ejemplo/
│   │           └── foro/
│   │               ├── controller/
│   │               │   └── TopicoController.java
│   │               │   └── UsuarioController.java
│   │               ├── model/
│   │               │   └── Topico.java
│   │               │   └── Usuario.java
│   │               ├── repository/
│   │               │   └── TopicoRepository.java
│   │               │   └── UsuarioRepository.java
│   │               ├── service/
│   │               │   └── TopicoService.java
│   │               │   └── UsuarioService.java
│   │               ├── security/
│   │               │   └── WebSecurityConfig.java
│   │               └── ForoApplication.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/
            └── ejemplo/
                └── foro/
                    └── ForoApplicationTests.java
