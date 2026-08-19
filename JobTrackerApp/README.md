# Job Application Tracker

A web-based Job Application Tracker developed using Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS and JavaScript.

The application helps users manage job applications, track application status, search companies and update application information through a simple dashboard.

## Features

- Add new job applications
- View all job applications
- View application by ID
- Update job application details
- Delete job applications
- Search applications by company name
- Filter applications by status
- Dashboard with application statistics
- Form validation
- Exception handling
- REST API integration
- MySQL database persistence
- JavaScript Fetch API integration

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

- Frontend
- JavaScript Fetch API
- Spring Boot REST Controller
- Service Layer
- Spring Data JPA Repository
- MySQL Database

## Main Module

### Job Application

Each job application contains:

- Application ID
- Company Name
- Job Role
- Location
- Salary
- Application Status
- Applied Date
- Follow-up Date
- Created Date
- Updated Date

## REST API Endpoints

### Add Application

- POST `/api/applications`

### Get All Applications

- GET `/api/applications`

### Get Application By ID

- GET `/api/applications/{jid}`

### Update Application

- PUT `/api/applications`

### Delete Application

- DELETE `/api/applications/{jid}`

### Search By Company

- GET `/api/applications/search?companyName=TCS`

### Filter By Status

- GET `/api/applications/status/APPLIED`

## Validation

- Validates required application fields
- Prevents invalid application data
- Uses Jakarta Validation
- Handles invalid requests

## Exception Handling

- Uses custom `JobApplicationNotFoundException`
- Handles requests for non-existing application IDs
- Provides meaningful error messages

## Database

- MySQL is used for persistent data storage
- Spring Data JPA is used for database operations
- Hibernate is used as the JPA implementation
- Java entities are mapped to database tables using JPA annotations

## Frontend

- HTML5 is used to create the user interface
- CSS3 is used for styling
- JavaScript is used for frontend functionality
- Fetch API is used to communicate with REST APIs
- Dashboard displays application statistics
- Search and status filtering are supported
- Add, Edit, Update and Delete operations are available

## Testing

- REST APIs tested using Postman
- CRUD operations tested through the frontend
- Search functionality tested
- Status filtering tested
- Validation tested
- Exception handling tested

## How to Run

- Clone the repository
- Open the project in Eclipse or another Java IDE
- Create a MySQL database
- Configure database details in `application.properties`
- Run the Spring Boot application
- Open the application in a browser

## Future Enhancements

- User authentication and authorization
- Pagination and sorting
- Email reminders for follow-up dates
- Application analytics
- Export applications to Excel or PDF
- Improved responsive design

## Author

Kishan P M

Java Developer | Java | Spring Boot | MySQL | REST API