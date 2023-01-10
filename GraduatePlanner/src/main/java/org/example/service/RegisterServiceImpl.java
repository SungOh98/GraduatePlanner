package org.example.service;

import org.example.domain.Register;
import org.example.domain.Student;
import org.example.domain.Subject;
import org.example.dto.RegiDto;
import org.example.dto.RegisterDto;
import org.example.repository.RegisterMapper;
import org.example.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisterServiceImpl implements RegisterService{

    private final RegisterMapper registerMapper;
    private final StudentService studentService;
    private final SubjectService subjectService;
    private final StudentMapper studentMapper;

    @Autowired
    public RegisterServiceImpl(RegisterMapper registerMapper, StudentService studentService, SubjectService subjectService, StudentMapper studentMapper) {
        this.registerMapper = registerMapper;
        this.studentService = studentService;
        this.subjectService = subjectService;
        this.studentMapper = studentMapper;
    }

    /**
     *
     * @param regiDto : json으로 받은 객체임 멤버 변수로 계정 이름(String) 과 신청 과목들(List<String>)이 있음
     */
    public void register(RegiDto regiDto) {
        // 과목 이름 리스트
        List<String> subjectNames = regiDto.getSubjectNames();
        // 계정 이름
        String account = regiDto.getAccount();

        // 과목 리스트
        List<Subject> subjectList = new ArrayList<>();

        for (String subjectName : subjectNames) {
            subjectList.add(subjectService.getByName(subjectName));
        }
        // 학생 객체
        Student student = studentService.getStudentByAccount(account);

        int plus_credit = 0;
        for (Subject subject : subjectList) {
            Register register = new Register();
            register.setSubject_id(subject.getId());
            register.setStudent_id(student.getId());
            plus_credit += subject.getCredit();
            registerMapper.register(register);
        }
        // 해당 학생의 현재 획득 학점 갱신
        student.setCurrent_credits(student.getCurrent_credits() + plus_credit);
        studentMapper.update(student);
    }

    public RegisterDto findAllSubject(Long id) {
        return registerMapper.getAllType(id);
    }

    public RegisterDto findSubjectByType(Long id, String type) {
        RegisterDto registerDto = registerMapper.getAllType(id);
        registerDto.setSubjects(
                registerDto.getSubjects()
                        .stream()
                        .filter(a -> a.getType().equals(type))
                        .collect(Collectors.toList())
        );
        return registerDto;
    }

}
