# Employee Management App

This is a Java web application that provides a RESTful API for managing employee data, built using Spring Boot and MySQL. The app supports CRUD (Create, Read, Update, and Delete) operations for managing employee details such as name and salary. The API is implemented using Spring MVC and provides endpoints for retrieving a list of all employees, retrieving a single employee by id, creating a new employee, updating an existing employee, and deleting an employee. The frontend of the app is built using React and Axious, providing a simple UI for interacting with the API. The frontend allows users to view, add, edit, and delete employee details through the API. The app demonstrates how to use modern web development tools and frameworks to create a simple, yet effective, data management application.

## Installation

To install and run the app, follow these steps:

1. Clone the repository to your local machine.
2. Install MySQL and create a new database called "employee_db".
3. Update the database connection settings in the application.properties file.
4. Build and run the app using Maven: `mvn spring-boot:run`.
5. Open a web browser and go to http://localhost:8080 to view the app.

## API Documentation

The app provides the following API endpoints:

* GET /employees - Retrieve a list of all employees.
* GET /employees/{id} - Retrieve a single employee by id.
* POST /employees - Create a new employee.
* PUT /employees/{id} - Update an existing employee.
* DELETE /employees/{id} - Delete an employee by id.

## Frontend Usage

The frontend of the app provides a simple UI for managing employee details. To use the frontend, follow these steps:

1. Run npm install then npm start.
2. Open a web browser and go to http://localhost:3000 to view the frontend.
3. Use the UI to view, add, edit, or delete employee details.
4. Changes made in the UI will be reflected in the backend API.

