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
4. Verifica la instalación:
    - Abre el `Símbolo del sistema` y ejecuta:
        ```bash
        java -version
        ```

---

## 2. Instalar Apache Tomcat

### En Linux (Ubuntu/Debian):

1. Abre la terminal.
2. Instala Tomcat desde los repositorios oficiales:
    ```bash
    sudo apt update
    sudo apt install tomcat9
    ```

3. Verifica la instalación abriendo un navegador y visitando [http://localhost:8080](http://localhost:8080).

### En macOS:

1. Abre la terminal.
2. Instala Tomcat usando Homebrew:
    ```bash
    brew install tomcat
    ```

3. Inicia Tomcat:
    ```bash
    brew services start tomcat
    ```

4. Verifica que Tomcat esté funcionando accediendo a [http://localhost:8080](http://localhost:8080) en tu navegador.

### En Windows:

1. Dirígete al [sitio web oficial de Apache Tomcat](https://tomcat.apache.org/download-90.cgi).
2. Descarga el archivo ZIP o EXE para Windows.
3. Extrae el archivo ZIP a la ubicación deseada, por ejemplo, `C:\apache-tomcat-9.0`.
4. Abre una terminal (`cmd`) y navega hasta el directorio `bin` de Tomcat:
    ```bash
    cd C:\apache-tomcat-9.0\bin
    ```
5. Inicia Tomcat ejecutando:
    ```bash
    startup.bat
    ```

6. Verifica que Tomcat esté funcionando accediendo a [http://localhost:8080](http://localhost:8080).

---

## 3. Configuración adicional (si es necesario)

- Si deseas configurar Tomcat para que se ejecute automáticamente al iniciar tu sistema, consulta la documentación específica de tu sistema operativo.
- Para personalizar la configuración de Tomcat, puedes editar el archivo `conf/server.xml`.

---

¡Listo! Ahora tienes Java y Tomcat instalados y funcionando en tu sistema.

Si tienes algún problema o pregunta, no dudes en abrir un *issue* en este repositorio.
