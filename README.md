# Guía de Instalación: Java y Tomcat

Este repositorio requiere que tengas instalado Java y Apache Tomcat para poder ejecutarlo correctamente. A continuación te explicamos cómo instalar ambos en tu sistema.

## Requisitos previos

- Sistema operativo: Windows.
- Acceso a la terminal o línea de comandos.

---

## 1. Instalar Java

Para ejecutar aplicaciones Java, necesitas tener instalado el **JDK (Java Development Kit)**. A continuación se describen los pasos para instalarlo en diferentes sistemas operativos.

### En Windows:

1. Dirígete al [sitio web de Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) o usa [OpenJDK](https://jdk.java.net/23/) para descargar el JDK.
2. Descarga e instala el archivo `.exe` correspondiente a tu sistema operativo.
3. Durante la instalación, asegúrate de seleccionar la opción para agregar Java al **PATH** del sistema.
4. Verifica la instalación JDK 23.0.1:
    - Abre el `Símbolo del sistema` y ejecuta:
        ```bash
        java -version
        ```

---

## 2. Instalar Apache Tomcat

### En Windows:

1. Dirígete al [sitio web oficial de Apache Tomcat](https://tomcat.apache.org/download-90.cgi).
2. Descarga el archivo ZIP o EXE para Windows.
3. Extrae el archivo ZIP a la ubicación deseada, por ejemplo, `C:\apache-tomcat-11.0`.
4. Abre una terminal (`cmd`) y navega hasta el directorio `bin` de Tomcat:
    ```bash
    cd C:\apache-tomcat-11.0\bin
    ```
5. Inicia Tomcat ejecutando:
    ```bash
    startup.bat
    ```

6. Verifica que Tomcat esté funcionando accediendo a [http://localhost:8080](http://localhost:8080).

---

# Glosario de Términos de Jakarta EE 

Jakarta EE
El sucesor de Java EE (Java Platform, Enterprise Edition), Jakarta EE es un conjunto de especificaciones para desarrollar aplicaciones empresariales en Java. Jakarta EE es gestionado por la Eclipse Foundation desde que Oracle lo donó en 2017.

Servlet
Un servlet es una clase Java que responde a peticiones HTTP dentro de un contenedor de servlets (como Apache Tomcat o el contenedor de servlets de Jakarta EE). Los servlets son componentes fundamentales en el desarrollo de aplicaciones web dinámicas.

JSP (JavaServer Pages)
Tecnología de Jakarta EE que permite incrustar código Java en páginas HTML mediante etiquetas especiales. Se utiliza principalmente para desarrollar vistas en aplicaciones web.

EJB (Enterprise JavaBeans)
Un conjunto de especificaciones para desarrollar componentes de negocio que se ejecutan en un servidor de aplicaciones. Jakarta EE utiliza EJB para manejar transacciones, seguridad, concurrencia y otras funcionalidades relacionadas con la lógica de negocio.

JPA (Jakarta Persistence API)
API para la gestión de la persistencia de datos en aplicaciones Java. JPA permite mapear las clases Java a tablas en bases de datos relacionales y realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) de manera simplificada.

CDI (Contexts and Dependency Injection)
Especificación para la inyección de dependencias y la gestión de contextos en aplicaciones Jakarta EE. CDI permite a los desarrolladores crear aplicaciones modulares y escalables, facilitando la integración de los componentes.

JSF (Jakarta Server Faces)
Un marco de trabajo basado en componentes para desarrollar interfaces de usuario en aplicaciones web. Facilita la creación de páginas web con Java, permitiendo la integración con otros componentes de Jakarta EE.

JAX-RS (Jakarta API for RESTful Web Services)
Especificación de Jakarta EE que proporciona una API para la creación de servicios web RESTful. JAX-RS facilita la exposición de datos y servicios a través de HTTP en formato JSON o XML.

JAX-WS (Jakarta API for XML Web Services)
Especificación de Jakarta EE para crear servicios web basados en SOAP (Simple Object Access Protocol). Es útil para la interoperabilidad entre diferentes plataformas y aplicaciones.

Jakarta Security
Un conjunto de especificaciones que proporcionan mecanismos para autenticar usuarios, autorizar acceso y proteger aplicaciones web. Permite manejar la seguridad en aplicaciones empresariales.

Jakarta Transactions (JTA)
API que permite la gestión de transacciones distribuidas en aplicaciones. Asegura la consistencia y la integridad de los datos en sistemas con múltiples fuentes de datos.

Jakarta Mail
API para enviar, recibir y gestionar correos electrónicos desde aplicaciones Java. Facilita la integración de funcionalidades de correo electrónico en las aplicaciones empresariales.

Jakarta Faces (JSF)
Como mencionamos anteriormente, es un marco para la creación de interfaces de usuario. Utiliza el patrón de diseño Modelo-Vista-Controlador (MVC) para facilitar la construcción de aplicaciones web.

Jakarta Batch
Especificación para la ejecución de trabajos por lotes (batch jobs). Se utiliza para gestionar procesos que necesitan realizar grandes cantidades de datos de manera eficiente.

Jakarta NoSQL
API para integrar bases de datos NoSQL en aplicaciones Jakarta EE, facilitando la persistencia de datos no estructurados o semiestructurados.

MicroProfile
Un conjunto de especificaciones y herramientas basadas en Jakarta EE para desarrollar aplicaciones Java microservicios, optimizadas para la nube y el entorno de contenedores (como Kubernetes).

Contexto y Ámbito
Los contextos son el entorno donde los objetos de una aplicación pueden existir. En Jakarta EE, los contextos son gestionados por CDI, lo que permite definir el ciclo de vida de los objetos dentro de diferentes ámbitos, como solicitud, sesión o aplicación.

Inyección de Dependencias (DI)
Técnica que permite a los componentes de una aplicación obtener sus dependencias sin tener que crearlas ellos mismos. CDI es la implementación de Jakarta EE para gestionar esta inyección.

Arquitectura MVC (Modelo-Vista-Controlador)
Un patrón de diseño utilizado en Jakarta EE (especialmente en JSF) que separa las responsabilidades de la lógica de negocios (modelo), la presentación (vista) y el control del flujo de la aplicación (controlador).

Container-Managed Entity Manager (CEM)
En el contexto de JPA, se refiere a un gestor de entidades gestionado por el contenedor (el servidor de aplicaciones). El CEM se encarga de la persistencia y del ciclo de vida de las entidades.
