# Usamos una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Copiamos el archivo jar de tu proyecto (lo creamos en el build)
COPY target/*.jar app.jar

# Exponemos el puerto en el que la app escucha (por defecto Spring Boot usa el 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
