package org.example.controller;

import org.example.domain.Student;
import org.example.dto.StudentDto;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public String createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return "Create SUCCESS!";
    }


    @GetMapping
    public List<Student> studentInfo() {
        return studentService.getAllStudent();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public void updateStudent(@RequestBody StudentDto studentDto, @PathVariable Long id) {
        studentService.updateStudent(studentDto, id);
    }


    @DeleteMapping
    public void deleteStudent() {
    }
}
