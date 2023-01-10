package org.example.service;


import org.example.domain.Student;
import org.example.dto.StudentDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface StudentService {
    void createStudent(StudentDto studentDto);
    List<Student> getAllStudent();

    Student getStudentByAccount(String account);
    void updateStudent(StudentDto studentDto, Long id);

    Student getById(Long id);
    void deleteStudent();
}
