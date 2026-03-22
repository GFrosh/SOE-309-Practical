package com.example.Student.Manage.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student register(Student student) {
        // LOGIC: CHECK IF EMAIL IS ALREADY TAKEN
        if (studentRepository.findByEmail(student.getEmail()).isPresent()) {
            throw new RuntimeException("Email IS already taken");
        }
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found.");
        }
        studentRepository.deleteById(id);
    }

}
