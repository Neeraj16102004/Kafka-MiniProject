# Kafka Producer-Consumer Project (Spring Boot & Kafka)

A beginner-friendly project demonstrating real-time messaging using **Apache Kafka** with **Spring Boot**.  
This project includes a simple **Producer** to send messages and a **Consumer** to listen and process them.

---

## 🚀 Features
- Kafka Producer to publish messages.
- Kafka Consumer to subscribe and process messages.
- Configured topics, partitions, and brokers with **Docker**.
- End-to-end testing of message flow.

---

## 🛠 Tech Stack
- **Java 23**  
- **Spring Boot 3**  
- **Apache Kafka**  
- **Docker**  

---

## 📂 Project Structure
kafka-demo
├── src
│ ├── main
│ │ ├── java/com/example/kafka
│ │ │ ├── producer # Producer code
│ │ │ ├── consumer # Consumer code
│ │ │ └── config # Kafka configuration
│ │ └── resources
│ │ └── application.properties
└── pom.xml

yaml
Copy code

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/kafka-demo.git
cd kafka-demo
2. Start Kafka & Zookeeper using Docker
bash
Copy code
docker-compose up -d
(docker-compose.yml should contain Kafka + Zookeeper setup)

3. Run the Spring Boot Application
bash
Copy code
./mvnw spring-boot:run
4. Test Message Flow
Send a message using REST API (Producer endpoint):

bash
Copy code
POST http://localhost:8080/api/v1/messages?message=HelloKafka
Check logs to see Consumer receiving the message.

📖 Learning Outcomes
Understand basics of Apache Kafka (producer, consumer, topics, partitions, consumer groups).

Learn Spring Boot Kafka integration.

Hands-on practice with real-time messaging systems.

📝 License
This project is for learning purposes and is open for anyone to use.
