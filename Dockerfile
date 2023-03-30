# Use the official OpenJDK 11 image as a base image
FROM openjdk:11

# Set the working directory
WORKDIR /opt

# Copy the application JAR file to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /opt/demo.jar

# Set the entrypoint command to run the application
CMD ["java", "-jar", "/opt/demo.jar"]