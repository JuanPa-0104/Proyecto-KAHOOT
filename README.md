# ProyectoJava

Aplicación de escritorio con JavaFX 21, Java 21, Maven y JUnit 5.

## Requisitos

- JDK 21 (Eclipse Temurin)
- Maven se descarga automáticamente con el Maven Wrapper incluido; no necesitas instalarlo ni añadirlo al `PATH`.

JavaFX se descarga automáticamente como dependencia de Maven; no hace falta instalarlo aparte.

## Estructura

```
ProyectoJava/
├── pom.xml                              # Maven + javafx-maven-plugin
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── module-info.java         # Módulo Java (requires javafx.*)
│   │   │   └── com/proyecto/
│   │   │       ├── App.java             # Arranque de JavaFX (Application)
│   │   │       ├── MainController.java  # Controlador de main.fxml
│   │   │       └── Saludo.java          # Lógica de negocio
│   │   └── resources/com/proyecto/
│   │       ├── main.fxml                # Vista (editable con Scene Builder)
│   │       └── styles.css               # Estilos
│   └── test/java/com/proyecto/
│       └── SaludoTest.java              # Tests JUnit 5
└── README.md
```

## Comandos

En PowerShell, abre la carpeta que contiene `pom.xml` y `mvnw.cmd`.
Si estás en `C:\Users\camil\Desktop\ProyectoJava`, entra primero con `cd .\ProyectoJava`.

```powershell
.\mvnw.cmd javafx:run
```

La primera ejecución necesita conexión a Internet para descargar Maven y las dependencias.
El wrapper utiliza el JDK indicado en `JAVA_HOME`; esta variable debe apuntar a la carpeta del JDK 21, sin incluir `bin`.
En Windows, `mvnw.cmd` utiliza los certificados de confianza del sistema para las descargas HTTPS. Si defines un almacén de certificados en `MAVEN_OPTS`, se respeta esa configuración.
Los scripts proceden del [Maven Wrapper oficial](https://maven.apache.org/tools/wrapper/); el lanzador de Windows incluye este ajuste de certificados para el equipo.

| Acción                         | Comando              |
|--------------------------------|----------------------|
| Ejecutar la aplicación         | `.\mvnw.cmd javafx:run`     |
| Ejecutar los tests             | `.\mvnw.cmd test`           |
| Compilar                       | `.\mvnw.cmd compile`        |
| Crear imagen ejecutable (jlink)| `.\mvnw.cmd javafx:jlink`   |
| Limpiar                        | `.\mvnw.cmd clean`          |

`.\mvnw.cmd javafx:jlink` genera en `target/proyecto-image/` un runtime con la aplicación incluida; se lanza con `target/proyecto-image/bin/proyecto.bat`.

En Linux o macOS, utiliza `./mvnw` en lugar de `.\mvnw.cmd`.

## Añadir pantallas

1. Crea la vista `src/main/resources/com/proyecto/otra.fxml` con `fx:controller="com.proyecto.OtraController"`.
2. Crea el controlador `OtraController.java` en `com.proyecto`.
3. Si usas un paquete nuevo, añade `opens <paquete> to javafx.fxml;` en `module-info.java`.

Para diseñar las vistas visualmente puedes usar [Scene Builder](https://gluonhq.com/products/scene-builder/).
