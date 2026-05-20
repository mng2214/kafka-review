# Kafka Spring Boot Practice

Simple Kafka practice project using Spring Boot.

Flow:

REST API  
-> Producer  
-> Kafka Topic  
-> Consumer  
-> Logs

This project sends OrderCreatedEvent to Kafka and consumes it in the same Spring Boot app.

---

# Tech Stack

- Java 21
- Spring Boot
- Apache Kafka
- Docker Compose
- REST API

---

# Start Kafka

Run Kafka container:

bash docker compose up -d 

---

# Run Application

Run app manually from IntelliJ or:

bash ./gradlew bootRun 

---

# Send Test Request

bash curl -X POST http://localhost:2121/orders \   -H "Content-Type: application/json" \   -d '{"orderId":"1","customerEmail":"test@gmail.com","amount":99.99}' 

---

# Expected Logs

text Received event from Kafka: OrderCreatedEvent(...) 

---

# Features

- Kafka Producer
- Kafka Consumer
- JSON Event Messaging
- Topic Configuration
- Docker Kafka Setup
- Spring Kafka Integration
