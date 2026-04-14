FROM maven:3.9-eclipse-temurin-21-alpine
#Usa una imaen base que ya incluye Maven y Java 21

WORKDIR /app
#Define el directorio de trabajo dentro del cntendero

COPY pom.xml .
#Copia el archivo pom.xml desde tu máquina al contenedor (ruta actual / app)

COPY src ./src
#Copia el código fuente (carpeta src) al contenedor dentro de /app/src

RUN mvn clean package -DskipTests

ENTRYPOINT["java", "-jar", "target/WalmartApi-0.0.1-SNAPSHOT.jar"]
#Define el comando que se ejecutará al iniciar el contenedor(ejcuta el JAR)