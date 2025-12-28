Student Registration Java Servlet Application
📌 Project Overview

This project is a simple Java Servlet web application that allows users to:

Register students using a web form

Store student data in a database

View all registered students in a tabular format

The application demonstrates the use of Java Servlets, JSP, JDBC, and MVC architecture.

🛠️ Technologies Used

Java (Servlet API – Jakarta)

JSP (Java Server Pages)

JDBC

Maven

Embedded H2 Database

HTML

🧱 Architecture (MVC)

Model: Student.java

View: index.jsp, students.jsp

Controller: RegisterServlet, ShowAllStudentsServlet

DAO Layer: StudentDAO

Utility: Database connection & initialization

This separation improves maintainability and readability.

🗄️ Database Schema

Table Name: students

Column	Data Type	Constraints
id	  INT	Primary Key, Auto Increment
name	VARCHAR(100)	Not Null
email	VARCHAR(100)	Not Null, Unique
year	INT	Not Null

The database table is automatically created at runtime using an embedded H2 database.
