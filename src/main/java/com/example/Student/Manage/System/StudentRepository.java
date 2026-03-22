// THIS INTERFACE ACTS AS THE STORAGE MANAGER
// SPRING DATA JPA HANDLES THE SQL. WE ADD A CUSTOM METHOD TO FIND STUDENTS BY EMAIL.
package com.example.Student.Manage.System;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom Search: Spring writes the SQL for you based on the name!
    Optional<Student> findByEmail(String email);
}
