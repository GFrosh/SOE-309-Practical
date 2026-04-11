# Student Manage System

A Spring Boot REST API application for managing student records with CRUD operations.

## Project Overview

This is a Java-based backend service built with Spring Boot that provides a complete API for managing student information. The system uses a relational database (H2 by default) to persist student records.

## Technology Stack

- **Framework**: Spring Boot 3.5.12
- **Language**: Java 17
- **Build Tool**: Maven
- **Database**: H2 (In-memory, easily switchable to MySQL/PostgreSQL)
- **ORM**: Spring Data JPA
- **Libraries**: Lombok (for reducing boilerplate code)

## Project Structure

```
src/main/
├── java/com/example/Student/Manage/System/
│   ├── StudentManageSystemApplication.java    # Main application entry point
│   ├── model/                                  # (TO CREATE) Entity classes
│   ├── repository/                             # (TO CREATE) Data access layer
│   ├── service/                                # (TO CREATE) Business logic
│   └── controller/                             # (TO CREATE) REST endpoints
└── resources/
    └── application.properties                  # Configuration file
```

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Student-Manage-System
   ```

2. **Build the project**
   ```bash
   mvn clean install
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   The application will start on `http://localhost:8080`

## Next Steps to Implement

### Phase 1: Core Structure
- [ ] Create `Student` entity class with JPA annotations
- [ ] Create `StudentRepository` interface
- [ ] Create `StudentService` class with business logic
- [ ] Create `StudentController` with REST endpoints

### Phase 2: API Endpoints
- [ ] `GET /students` - Retrieve all students
- [ ] `GET /students/{id}` - Retrieve a specific student
- [ ] `POST /students` - Create a new student
- [ ] `PUT /students/{id}` - Update a student
- [ ] `DELETE /students/{id}` - Delete a student

### Phase 3: Enhancements
- [ ] Add input validation and error handling
- [ ] Implement pagination and sorting
- [ ] Add Swagger/OpenAPI documentation
- [ ] Configure a real database (MySQL/PostgreSQL)
- [ ] Add comprehensive unit and integration tests

## Database Configuration

**Current Setup (H2 In-Memory):**
- Database automatically creates at startup
- Data is cleared on restart

**To use MySQL/PostgreSQL:**
1. Add dependency in `pom.xml`:
   ```xml
   <dependency>
       <groupId>com.mysql</groupId>
       <artifactId>mysql-connector-j</artifactId>
   </dependency>
   ```

2. Update `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

## Dependencies

| Dependency | Purpose |
|-----------|---------|
| spring-boot-starter-data-jpa | JPA/Hibernate ORM support |
| spring-boot-starter-web | REST API and web framework |
| h2 | Embedded database |
| lombok | Reduces boilerplate code |
| spring-boot-starter-test | Unit and integration testing |

## Testing

Run tests with:
```bash
mvn test
```

## References

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Building REST APIs with Spring](https://spring.io/guides/tutorials/rest/)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [Maven Documentation](https://maven.apache.org/guides/index.html)

## License

This project is provided as-is for educational purposes.

## Author

[Gideon Onyegbula](https://devgideon.me/)
