# QuantumEdge-ResolveIt

### Complaint & Feedback Management System

---

## ✅ Project Overview

ResolveIt is a Java-based application that enables users to register complaints, track their status, and receive updates digitally. Administrators can view all complaints, update their status, and manage responses efficiently. It simplifies communication between users and the management team by providing a centralized, digital complaint management system.

---

## 🎯 Objectives

- Provide a simple digital platform for complaint submission
- Reduce paperwork and ensure faster resolution
- Improve transparency and communication between users & admin
- Allow admins to monitor, manage, and respond to issues easily
- Maintain a central database for storing complaint history

---

## 👥 System Users

### User Module
- Submit new complaint
- View complaint status
- Track previous complaints


### User Features
- Complaint submission form
- Real-time status tracking
- Simple login/registration
- Structured complaint categories

### Admin Features
- Centralized complaint dashboard
- Status update functionality
- View complaints by user or category
- Efficient monitoring of system performance

---

## 🗄 Database Schema

### Users Table
| Field       | Description |
|-------------|-------------|
| user_id     | Primary Key |
| username    | Login name  |
| password    | Hashed PW   |
| role        | user/admin  |

### Complaints Table
| Field         | Description       |
|---------------|------------------|
| complaint_id  | Primary Key      |
| user_id       | FK to Users      |
| category      | Complaint type   |
| description   | Details          |
| status        | Pending/In Progress/Resolved 

---

## 🗄 Technologies Used
- Java (Core)
- MySQL
- JDBC (Java Database Connectivity)
- IntelliJ IDEA 
- OOP, Classes, DAO Pattern, SQL, Exception Handling

---

## 🌐 Instructions for Submission
- Github link should be public
- README explains project setup, requirements, and how to run
- Code should be well-commented, modular, use proper coding standards

---

**Developed by Team QuantumEdge**

## Prerequisites

- Java JDK 11 or above
- MySQL 5.7 or above
- MySQL JDBC Driver (mysql-connector-java-8.0.x.jar)
- IntelliJ IDEA or any Java IDE

---

## How to Run

### Step 1: Database Setup

1. Open MySQL Command Line or MySQL Workbench
2. Create database and tables:

```sql
CREATE DATABASE resolve_it_db;
USE resolve_it_db;

CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('user', 'admin') DEFAULT 'user',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE complaints (
    complaint_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    category VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    status ENUM('Pending', 'In Progress', 'Resolved') DEFAULT 'Pending',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id) ON DELETE CASCADE
);

INSERT INTO users (username, password, role) VALUES ('admin', 'admin123', 'admin');
INSERT INTO users (username, password, role) VALUES ('user1', 'user123', 'user');
```

### Step 2: Configure Database Connection

Update `DB.java` with your MySQL credentials:
```java
private static final String DB_URL = "jdbc:mysql://localhost:3306/resolve_it_db";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "";
```

### Step 3: Add MySQL JDBC Driver

Download mysql-connector-java-8.0.33.jar and add to project classpath.

### Step 4: Run the Application

1. Open `Main.java` in IntelliJ IDEA
2. Click Run (or Shift + F10)
3. Login with:
   - Admin: username=admin, password=admin123
   - User: username=user1, password=user123

---
