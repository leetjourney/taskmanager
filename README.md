# Task Manager

## YouTube Playlist

Check out the full "Spring Boot Beginner to Intermediate" course: https://www.youtube.com/playlist?list=PLJce2FcDFtxL-3y86miLr_xLB5FsbK8GJ

## Description

This is a RESTful API for a task management system. It allows users to create, read, update, delete, and search tasks. Tasks have properties like title, description, completion status, and creation date.

## Features

- Create, update, delete, and retrieve tasks
- Search tasks by title or completion status
- Pagination and sorting support
- Input validation
- Global exception handling

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- Validation
- Maven

## API Endpoints

All endpoints are prefixed with `/api/v1/tasks`.

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

## Getting Started

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvnw spring-boot:run` to start the application.
4. The API will be available at `http://localhost:8080`.

## License

This work is licensed under the Creative Commons Attribution-NonCommercial 4.0 International License.
To view a copy of this license, visit https://creativecommons.org/licenses/by-nc/4.0/

Refer to the LICENSE file for details.
