package com.example.Student.Manage.System.service;

import com.example.Student.Manage.System.model.Student;
import com.example.Student.Manage.System.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student register(Student student) {
        if (studentRepository.findByEmail(student.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already taken");
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
