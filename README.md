
# Student Management System

A web-based Student Management System developed using Java, Spring Boot, Spring MVC, Hibernate, Thymeleaf, and MySQL. This application allows users to manage student records through a web interface and RESTful APIs.

## 🚀 Features

### Web Application (Spring Boot MVC)
- Add new student records
- View all students
- Update student details
- Delete student records
- User-friendly interface using Thymeleaf

### REST API
- Retrieve all students
- Retrieve a student by ID
- Create a new student
- Update an existing student
- Delete a student

## 🛠️ Technologies Used

- **Java** – Programming Language
- **Spring Boot** – Application Framework
- **Spring MVC** – Web Application Development
- **Spring Data JPA / Hibernate** – Database Operations
- **Thymeleaf** – Template Engine
- **MySQL** – Database
- **Maven** – Dependency Management
- **REST API** – HTTP-based Communication
- **Eclipse IDE** – Development Environment
- **Postman** – REST API Testing

## 📂 Project Structure

```text
StudentManagementSystem
│
├── src
│   └── main
│       ├── java
│       │   └── com.main.studentmanagementsystem
│       │       ├── controller
│       │       │   ├── Controller.java
│       │       │   └── StudentRestController.java
│       │       ├── entity
│       │       ├── repository
│       │       ├── service
│       │       └── serviceImpl
│       │
│       └── resources
│           ├── templates
│           └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Requirements

Make sure you have installed:

- Java JDK 17 or compatible version configured for the project
- MySQL Server
- Eclipse IDE or another Java IDE
- Maven
- Postman (for API testing)

## 🗄️ Database Configuration

1. Create a MySQL database:

```sql
CREATE DATABASE student_management;
```

2. Update your `application.properties` file with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace `YOUR_USERNAME` and `YOUR_PASSWORD` with your MySQL credentials.

## ▶️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/RaghuChauhan1999/REPOSITORY_NAME.git
```

2. Open Eclipse IDE.
3. Import the project as an Existing Maven Project.
4. Configure the MySQL database connection.
5. Update Maven dependencies.
6. Run the Spring Boot main application class.
7. Open your browser:

```text
http://localhost:8080
```

## 🔗 REST API Endpoints

Base URL:

```text
http://localhost:8080/api/students
```

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| POST | `/api/students` | Create a new student |
| PUT | `/api/students/{id}` | Update student by ID |
| DELETE | `/api/students/{id}` | Delete student by ID |

### Example: Get All Students

```http
GET http://localhost:8080/api/students
```

### Example: Get Student by ID

```http
GET http://localhost:8080/api/students/1
```

### Example: Create Student

```http
POST http://localhost:8080/api/students
Content-Type: application/json
```

Example JSON request body:

```json
{
  "name": "Rahul",
  "email": "rahul@example.com",
  "course": "Java"
}
```

> Note: Adjust the JSON fields according to the properties defined in your Student entity.

## 🧪 API Testing

REST APIs can be tested using Postman.

1. Start the Spring Boot application.
2. Open Postman.
3. Enter the API endpoint.
4. Select the appropriate HTTP method.
5. For POST and PUT requests, provide the JSON request body.
6. Send the request and verify the response.

## 🎯 Learning Outcomes

- Developed a CRUD-based web application using Spring Boot MVC.
- Implemented RESTful APIs for student management.
- Integrated MySQL with Spring Boot.
- Used Hibernate for database operations.
- Practiced HTTP methods such as GET, POST, PUT, and DELETE.
- Tested REST APIs using Postman.

## 👨‍💻 Author

**Raghu Chauhan**

- GitHub: [RaghuChauhan1999](https://github.com/RaghuChauhan1999)
- LinkedIn: [Raghu Chauhan](https://linkedin.com/in/raghuchauhan/)

---

⭐ If you find this project useful, feel free to star the repository!
