# Expense Tracker

A simple web-based Expense Tracker developed using Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS and JavaScript.

The application allows users to record, view, update and delete expenses and manage expense information through a simple web interface.

## Features

- Add new expenses
- View all expenses
- View expense by ID
- Update expense details
- Delete expenses
- Store expense information in MySQL
- REST API integration
- JavaScript Fetch API integration
- Simple and user-friendly interface

## Technologies Used

### Backend

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- REST API
- Maven

### Database

- MySQL

### Frontend

- HTML5
- CSS3
- JavaScript
- Fetch API

### Tools

- Eclipse
- Postman
- MySQL
- Git
- GitHub

## Project Architecture

The application follows a layered architecture.

- Controller
- Service
- Repository
- Database

The frontend communicates with the backend using REST APIs.

Frontend
    ↓
JavaScript Fetch API
    ↓
Spring Boot REST Controller
    ↓
Service Layer
    ↓
Spring Data JPA Repository
    ↓
MySQL Database

## Expense Module

Each expense contains:

- Expense ID
- Expense Title
- Category
- Amount
- Expense Date

## REST API Endpoints

### Add Expense

- POST `/api/expenses`

### Get All Expenses

- GET `/api/expenses`

### Get Expense By ID

- GET `/api/expenses/{id}`

### Update Expense

- PUT `/api/expenses`

### Delete Expense

- DELETE `/api/expenses/{id}`

## Database

MySQL is used for persistent storage.

Spring Data JPA and Hibernate are used to perform database operations.

The Expense entity is mapped to the database using JPA annotations.

## Frontend

The frontend is developed using:

- HTML5
- CSS3
- JavaScript
- Fetch API

JavaScript Fetch API is used to communicate with the Spring Boot REST APIs.

## Testing

The REST APIs are tested using Postman.

The following operations are tested:

- Add Expense
- Get All Expenses
- Get Expense By ID
- Update Expense
- Delete Expense

The frontend is also tested for CRUD operations.

## How to Run

- Clone the repository
- Open the ExpenseTracker project in Eclipse or another Java IDE
- Create a MySQL database
- Configure the database details in `application.properties`
- Run the Spring Boot application
- Open the application in a browser

## Future Enhancements

- Expense category filtering
- Monthly expense summary
- Expense dashboard
- Date-based expense search
- Expense charts and reports
- Export expenses to Excel or PDF

## Author

Kishan P M

Java Developer | Java | Spring Boot | MySQL | REST API