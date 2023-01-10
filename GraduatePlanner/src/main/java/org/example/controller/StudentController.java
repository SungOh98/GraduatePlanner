package org.example.controller;

import org.example.domain.Student;
import org.example.dto.StudentDto;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 학생 요청을 받아들이는 컨트롤러
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    // studentService와 의존 관계
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Create : 학생 생성 요청
     * json 객체를 받아 DTO로 변경 후 Service로 넘겨줌.
     */
    @PostMapping
    public void createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
    }

    /**
     * Read : 학생 조회 요청 -> 전체 학생을 조회하는 요청을 받음
     */
    @GetMapping
    public List<Student> studentInfo() {
        return studentService.getAllStudent();
    }

    /**
     * Update : 학생 수정 요청
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public void updateStudent(@RequestBody StudentDto studentDto, @PathVariable Long id) {
        studentService.updateStudent(studentDto, id);
    }

    /**
     *  Delete : 학생 삭제 요청
     */
    @DeleteMapping
    public void deleteStudent() {}
}
