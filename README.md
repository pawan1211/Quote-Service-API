# Quote-Service-API


This project demonstrates:

Creation of a simple REST service using Spring Boot

Exposure of one REST endpoint

Modular and production-style project structure

Proper use of Dependency Injection

The application provides a simple Quote Service API that returns a daily quote.

🏗️ Project Structure (Production-Style Modular Design)
quote-service

 ├── controller
 
 │     └── QuoteController.java
 
 ├── service
 
 │     ├── QuoteService.java
 
 │     └── QuoteServiceImpl.java
 
 ├── model
 
 │     └── Quote.java

 │  
 └── QuoteServiceApplication.java
🧱 Architecture Overview

This project follows clean layered architecture principles:

1️⃣ Controller Layer

Handles incoming HTTP requests and exposes REST endpoints.

2️⃣ Service Layer

Contains business logic and core application processing.

3️⃣ Model Layer

Represents data structures used within the application.



4️⃣ Main Application Class

Bootstraps and starts the Spring Boot application.

⚙️ Technologies Used

Java 17+

Spring Boot

Spring Web

Maven

Lombok (optional)

🔥 Dependency Injection Demonstration

The application uses Constructor-Based Dependency Injection, which is considered a best practice in Spring Boot applications.

Spring automatically:

Detects service implementations

Creates beans inside the application context

Injects dependencies into required classes (e.g., controller)

Why Constructor Injection?

Promotes loose coupling

Improves testability

Ensures immutability of dependencies

Aligns with production standards

🌐 Exposed REST Endpoint

HTTP Method: GET

Endpoint: /api/quote

When accessed, the API returns a JSON response containing:

Quote message

Author name

▶️ How to Run the Application

Option 1: Using Maven

Run the application using:

mvn spring-boot:run

Option 2: Build and Run JAR

mvn clean install

java -jar target/quote-service-0.0.1-SNAPSHOT.jar

The application will start on:

http://localhost:8080

🧪 How to Test the API

Open your browser or Postman and hit:

http://localhost:8080/api/quote

You will receive a JSON response containing a quote.

📦 Key Concepts Demonstrated

REST API Development

Layered Architecture

Spring Bean Management

Dependency Injection

Clean Code Structure

Interface-Based Design
