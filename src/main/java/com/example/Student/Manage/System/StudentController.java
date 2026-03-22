// THE WAITER WHO TAKES ALL THE ORDER AND BRINGS THE FOOD
// THE CONTROLLER MANAGES THE TRAFFIC. USE RESPONSE ENTITIES TO SEND BACK STATUS CODES AND MESSAGES.

package com.example.Student.Manage.System;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @PostMapping
    public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
        // @Valid TRIGGERS THE @NOTBLANK AND @EMAIL VALIDATIONS IN THE STUDENT MODEL
        return new ResponseEntity<>(studentService.register(student), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.ok("Student deleted successfully.");
    }
}

