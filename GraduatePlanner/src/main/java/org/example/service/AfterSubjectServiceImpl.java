package org.example.service;

import org.example.domain.Department;
import org.example.dto.AfterSubjectDto;
import org.example.dto.RequireDto;
import org.example.dto.SubjectDto;
import org.example.repository.AfterSubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AfterSubjectServiceImpl implements AfterSubjectService {
    private final AfterSubjectMapper afterSubjectMapper;
    private final RegisterService registerService;

    private final DepartmentService departmentService;

    private final StudentService studentService;

    @Autowired
    public AfterSubjectServiceImpl(AfterSubjectMapper afterSubjectMapper, RegisterService registerService, DepartmentService departmentService, StudentService studentService) {
        this.afterSubjectMapper = afterSubjectMapper;
        this.registerService = registerService;
        this.departmentService = departmentService;
        this.studentService = studentService;
    }

    @Override
    public RequireDto getAllRequire(Long department_id) {
        RequireDto requireDto = afterSubjectMapper.getRequire(department_id);
        requireDto.setDepartmentName(departmentService.getById(department_id).getName());
        return requireDto;
    }

    @Override
    public AfterSubjectDto getAfterSubject(String type, Long id, Long department_id) {
        // requireDTO -> department - subject 매핑 테이블의 결과 컬렉션
        Set<SubjectDto> requireSubjects = new HashSet<>(getAllRequire(department_id).getSubjectList());
        // registerDTO -> student - subject 매핑 테이블의 결과 컬렉션
        Set<SubjectDto> currentSubjects = new HashSet<>(registerService.findAllSubject(id).getSubjects());
        // 차집합으로 앞으로 들어야 할 것들만 남김
        requireSubjects.removeAll(currentSubjects);

        List<SubjectDto> afterSubject = requireSubjects.stream()
                .filter(a -> a.getType().equals(type))
                .collect(Collectors.toList());

        AfterSubjectDto afterSubjectDto = new AfterSubjectDto();
        afterSubjectDto.setSubjectDtoList(afterSubject);

        Department department = departmentService.getById(id);
        afterSubjectDto.setAfterCredit(
                department.getGeneral_credit()
                        + department.getMajor_credit()
                        - studentService.getById(id).getCurrent_credits()
        );
        return afterSubjectDto;
    }


}
