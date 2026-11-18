I have developed a Microservices-based application consisting of three services:
User Service – Manages user information.
Post Service – Manages posts created by users.
Notification Service – Manages notifications.
This project is a Spring Boot Microservices-based application consisting of three independent services: User Service, Post Service, and Notification Service.
The services communicate with each other using REST APIs and RestTemplate for synchronous inter-service communication.
The application demonstrates how multiple microservices interact to retrieve and manage related data using a unique User ID.
Notification Service fetches notifications for user ID 101.

Notification Service
Manages user notifications.
Exposes REST APIs to retrieve notifications based on User ID.
Provides notification details to other microservices.
