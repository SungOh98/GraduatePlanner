package org.example.service;

import org.example.domain.Student;
import org.example.dto.StudentDto;
import org.example.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// DTO <-> domain 만들어 다음 계층으로 넘김
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public void createStudent(StudentDto studentDto) {
        // domain 객체 생성.
        Student student = new Student();
        student.setStudent_number(studentDto.getStudent_number());
        student.setAccount(studentDto.getAccount());
        student.setPassword(studentDto.getPassword());
        student.setName(studentDto.getName());
        student.setYear(studentDto.getYear());
        // 추후에 부서 DB랑 연동 후 변경해야 함. : 1번이 컴공이라고 가정
        student.setDepartment_id(1);

        // repository 객체로 DB에 학생 생성하여 저장.
        studentMapper.create(student);

    }

    public List<Student> getAllStudent() {
        return studentMapper.getAll();
    }

    public Student getStudentByAccount(String account) {
        return studentMapper.getByAccount(account);
    }

    public void updateStudent(StudentDto studentDto, Long id) {
        Student student = new Student();
        student.setId(id);
        student.setCurrent_credits(studentDto.getCurrent_credits());
        student.setAccount(studentDto.getAccount());
        student.setStudent_number(studentDto.getStudent_number());
        student.setName(studentDto.getName());
        student.setYear(studentDto.getYear());
        student.setDepartment_id(student.getDepartment_id());
        student.setPassword(studentDto.getPassword());
        studentMapper.update(student);
    }

    @Override
    public Student getById(Long id) {
        return studentMapper.getById(id);
    }

    public void deleteStudent() {

    }
}
