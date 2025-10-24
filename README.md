# Proyecto JAVA0078_M6_GestionContactos

## Contexto

Este proyecto corresponde al desarrollo de un **prototipo funcional** de una aplicación web para la **gestión de contactos personales**.  
El objetivo es permitir registrar, listar y visualizar contactos con nombre, correo y número telefónico, siguiendo el modelo **MVC (Modelo–Vista–Controlador)** y las buenas prácticas de desarrollo con **Spring Boot**.

---

## Tecnologías utilizadas

- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Web (spring-boot-starter-web)**
- **JSP + JSTL** para las vistas
- **Apache Tomcat embebido**
- **Maven** como gestor de dependencias
- **Bootstrap 5** para el diseño responsivo de las vistas
- **Spring Boot Test** para pruebas unitarias

---

## Estructura del proyecto

```
JAVA0078_M6_GestionContactos
├─src/
│	 ├─ main/
│	 │   ├─ java/
│	 │   │   └─ cl/web/
│	 │   │       ├─ Java0078M6GestionContactosApplication.java
│	 │   │       ├─ controller/
│	 │   │       │   └─ ContactoController.java
│	 │   │       ├─ model/
│	 │   │       │   └─ Contacto.java
│	 │   │       └─ service/
│	 │   │           ├─ ContactoService.java
│	 │   │           └─ ContactoServiceImpl.java
│	 │   └─ resources/
│	 │       └─ application.properties
│	 └─ webapp/
│	     └─ WEB-INF/
│	         └─ views/
│	             ├─ formulario.jsp
│	             └─ lista.jsp
├─ target/
│	 └─ JAVA0078_M6_GestionContactos-1.0.0.war
├─ despliegue tomcat.png
├─ pom.xml
└─ README.md

```

---

## Arquitectura y funcionamiento

### 1. Modelo
Define la clase **Contacto** con los atributos:
- `nombre`
- `correo`
- `telefono`

Marcada con `@Component` para que Spring la gestione como un **Bean**.

---

### 2. Servicio
Implementa una interfaz `ContactoService` y una clase `ContactoServiceImpl` que mantiene una **lista local** de contactos.  
Esta capa contiene los métodos principales:
- `agregar(contacto)`
- `obtenerTodos()`
- `buscarPorNombre(nombre)`

La clase está anotada con `@Service`, lo que indica que pertenece a la **lógica de negocio** y puede ser **inyectada** en el controlador mediante `@Autowired`.

---

### 3. Controlador
El controlador maneja las peticiones y respuestas HTTP.  
Contiene los métodos para:
- Mostrar el formulario (`GET /formulario`)
- Guardar un contacto (`POST /guardar`)
- Listar todos los contactos (`GET /lista`)

Usa el objeto `Model` para pasar datos entre el controlador y las vistas.

---

### 4. Vistas (JSP)
Se desarrollaron dos vistas principales con **Bootstrap 5** para una interfaz moderna:

- **formulario.jsp:** permite ingresar los datos de un nuevo contacto.
- **lista.jsp:** muestra los contactos registrados en una tabla dinámica con JSTL.

La comunicación entre capas garantiza que los datos fluyan correctamente del **formulario → controlador → servicio → vista**.

---

## Configuración (application.properties)

```
spring.application.name=JAVA0078_M6_GestionContactos
server.port=8081
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
logging.level.org.springframework=DEBUG
```

---

## Pruebas

Se incluye una clase de prueba unitaria con **Spring Boot Test**, la cual verifica que el servicio:
- Agregue contactos correctamente.
- Liste los contactos registrados.

---

## Empaquetado del proyecto

El proyecto está configurado como un **WAR** para despliegue en servidores externos (como Tomcat):

```xml
<packaging>war</packaging>
```

Para generar el archivo ejecutable:

```bash
mvn clean package
```

El artefacto se genera en la carpeta:
```
target/
```

---

## Elección de la tecnología de vista

Se eligió **JSP** sobre otras tecnologías como **Thymeleaf** porque:
- Permite compatibilidad con proyectos heredados.
- Es ligera y de fácil integración con Spring Boot.
- Facilita el uso de **JSTL** para iteraciones y condiciones dinámicas en las vistas.

---

## Flujo del sistema

1. El usuario accede al formulario para agregar un nuevo contacto.  
2. El formulario envía los datos al controlador mediante `POST /guardar`.  
3. El servicio almacena el contacto en una lista local.  
4. El sistema redirige a la vista `/lista`, que muestra todos los contactos registrados.  

---

## Autor

- Laura Duhalde
