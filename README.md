# Task Manager

## YouTube Playlist

Check out the full "Spring Boot Beginner to Intermediate" course: https://www.youtube.com/playlist?list=PLJce2FcDFtxL-3y86miLr_xLB5FsbK8GJ

## Description

This is a RESTful API for a task management system. It allows users to create, read, update, delete, and search tasks and categories. Tasks have properties like title, description, completion status, and creation date. Categories can be created and retrieved to organize tasks.

## Features

- Create, update, delete, and retrieve tasks
- Search tasks by title or completion status
- Pagination and sorting support
- Manage categories for tasks
- Input validation
- Global exception handling
- Application info endpoints
- H2 database console
- Spring Boot Actuator for monitoring

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Boot Actuator
- Validation
- H2 Database
- Lombok
- Maven

## Prerequisites

- Java 21 or higher
- Maven 3.6+

## API Endpoints

All task endpoints are prefixed with `/api/v1/tasks`.

### Get All Tasks
- **GET** `/api/v1/tasks`
- Query Parameters:
  - `page` (default: 0)
  - `size` (default: 10)
  - `sortBy` (default: "createdAt")
  - `sortDir` (default: "DESC")
- Returns paginated list of tasks.

### Get Task by ID
- **GET** `/api/v1/tasks/{id}`
- Path Variable: `id` (Long)
- Returns a single task.

### Create Task
- **POST** `/api/v1/tasks`
- Body: TaskRequest JSON
- Returns created task.

### Update Task
- **PUT** `/api/v1/tasks/{id}`
- Path Variable: `id` (Long)
- Body: TaskRequest JSON
- Returns updated task.

### Delete Task
- **DELETE** `/api/v1/tasks/{id}`
- Path Variable: `id` (Long)
- Returns 200 OK.

### Search Tasks
- **GET** `/api/v1/tasks/search`
- Query Parameters:
  - `title` (optional)
  - `completed` (optional, Boolean)
  - `page`, `size`, `sortBy`, `sortDir` (as above)
- Returns paginated search results.

### Get Tasks by Completion Status
- **GET** `/api/v1/tasks/completed/{status}`
- Path Variable: `status` (boolean)
- Returns list of tasks.

### Search Tasks by Title
- **GET** `/api/v1/tasks/search-by-title`
- Query Parameter: `title`
- Returns list of tasks.

### Categories

All category endpoints are prefixed with `/api/v1/categories`.

#### Get Category by ID
- **GET** `/api/v1/categories?id={id}`
- Query Parameter: `id` (Long)
- Returns a category.

#### Create Category
- **POST** `/api/v1/categories`
- Body: Category JSON
- Returns created category.

### Info

#### Get App Info
- **GET** `/api/v1/info`
- Returns application name, version, and max tasks per page.

#### Get Advanced App Info
- **GET** `/api/v1/info-advanced`
- Returns application name, version, and max tasks per page.

## Database

The application uses H2 in-memory database for development. The H2 console is available at `http://localhost:8080/h2-console` with the following credentials:
- JDBC URL: `jdbc:h2:mem:taskdb`
- Username: `sa`
- Password: `password`

## Monitoring

Spring Boot Actuator endpoints are exposed for monitoring and management. Available at `/actuator/*`, including:
- `/actuator/health` - Application health status
- `/actuator/info` - Application information
- `/actuator/metrics` - Application metrics
- `/actuator/env` - Environment properties
- `/actuator/logger` - Logger configuration
- `/actuator/beans` - Spring beans
- `/actuator/mappings` - Request mappings

## Getting Started

1. Clone the repository.
2. Ensure Java 21 and Maven are installed.
3. Navigate to the project directory.
4. Run `mvnw spring-boot:run` to start the application.
5. The API will be available at `http://localhost:8080`.
6. Access H2 console at `http://localhost:8080/h2-console`.
7. View actuator endpoints at `http://localhost:8080/actuator/`.

## License

This work is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License.
To view a copy of this license, visit https://creativecommons.org/licenses/by-nc/4.0/

Refer to the LICENSE file for details.
