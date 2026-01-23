# API Testing – Rest Assured

## Overview
This project includes a comprehensive API testing suite for the **Sparta Global Academy API**, designed to validate endpoint behaviour, data integrity, and API contracts.

The tests are implemented using **Rest Assured** and **JUnit 5**, with **DTO-based POJOs** used to model API responses. This approach improves readability, type safety, and maintainability while ensuring responses conform to expected structures.

The API tests focus on the following core resources:
- Students
- Trainers
- Courses

---

## Testing Tools & Technologies
- Java 21 
- Rest Assured  
- JUnit 5  
- Maven  
- Jackson (JSON serialization/deserialization)

---

## Testing Approach
The API tests follow a **black-box testing** approach and are structured using the **Given – When – Then**:

- **Given** – request configuration (base URI, headers, request body)
- **When** – execution of the HTTP request
- **Then** – validation of the response

Assertions are performed on:
- HTTP status codes
- Response body content
- Object relationships
- Error handling and edge cases

All responses are deserialized into DTO-based POJOs rather than using raw JSON path assertions.

---

## Test Coverage

### Students API
- Get all students
- Get student by ID
- Create a student
- Update student details
- Delete a student
- Validate invalid and non-existent IDs

### Trainers API
- Get all trainers
- Get trainer by ID
- Create a trainer
- Assign trainers to courses
- Update trainer details
- Delete a trainer
- Validate error responses

### Courses API
- Get all courses
- Get course by ID
- Create a course
- Enrol students onto courses
- Remove students from courses
- Assign trainers to courses
- Delete a course
- Validate edge cases and invalid requests

---

## Code Structure

The API tests are located within the `src/test` directory and follow a clear, modular structure to ensure scalability and maintainability.


---

## Package Breakdown

### POJOs Package
The `pojos` package contains DTO-based POJO classes used to map API responses.

- Ensures strong typing of response data
- Improves readability of assertions
- Reduces reliance on fragile JSON path checks
- Represents the API contract explicitly

---

### Rest Assured Test Packages
Each core API resource has its own dedicated test package:

- `courses` – Course-related API tests  
- `trainers` – Trainer-related API tests  
- `students` – Student-related API tests  

This separation improves clarity and allows each API to be tested independently while maintaining consistency across the test suite.

---

### Utils Package
The `utils` package contains shared configuration and helper classes:

- **API paths** are centrally defined and reused across tests
- Base URLs and endpoints are loaded from `config.properties`
- Prevents hardcoded URLs in test classes
- Simplifies environment changes (e.g. local, test, CI)

Example responsibilities:
- Reading configuration values
- Providing reusable endpoint paths
- Central Rest Assured setup

---

## Configuration Management

### config.properties
The `config.properties` file is located in the `src/test/resources` directory and contains:

- Base API URL
- Endpoint paths for Students, Trainers, and Courses

This allows endpoints to be updated without modifying test code.

---

## Validation & Assertions
Tests validate:
- Correct HTTP status codes (200, 201, 400, 404)
- Response body structure and values
- Successful creation, update, and deletion of resources
- Proper handling of invalid requests and edge cases

---

## Running the API Tests

### Prerequisites
- Java 21
- Maven
- Application running locally

### Run Tests
```bash
mvn test
