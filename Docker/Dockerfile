## Use OpenJDK 17 for building the application
#FROM openjdk:17-jdk-slim AS build
#
## Set the working directory inside the container
#WORKDIR /app
#
## Copy the source files into the container
#COPY src/ ./src/
#COPY /mssql-jdbc-12.10.0.jre11.jar .
#
## Compile the Java file (output the class files into the current directory)
#RUN javac -cp .:mssql-jdbc-12.10.0.jre11.jar src/sql_test.java
#
## Run the compiled class
#CMD ["java", "-cp", "src:mssql-jdbc-12.10.0.jre11.jar", "sql_test"]
#
#







# Use OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container
WORKDIR /app

# Copy the entire src folder into the container
COPY src/ ./src/

# Compile the Java source file
RUN javac src/test.java

# Run the Java program
CMD ["java", "-cp", "src", "test"]
