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
