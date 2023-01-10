package org.example.service;

import org.example.domain.Department;
import org.example.domain.Require;
import org.example.domain.Subject;
import org.example.dto.DepartmentDto;
import org.example.dto.RequDto;
import org.example.repository.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentMapper departmentMapper;
    private final SubjectService subjectService;

    @Autowired
    public DepartmentServiceImpl(DepartmentMapper departmentMapper, SubjectService subjectService) {
        this.departmentMapper = departmentMapper;
        this.subjectService = subjectService;
    }

    public void create(DepartmentDto departmentDto) {
        // DTO 객체를 Domain 객체에 담기
        Department department = new Department();
        department.setName(departmentDto.getName());
        department.setMajor_credit(departmentDto.getMajor_credit());
        department.setGeneral_credit(departmentDto.getGeneral_credit());

        departmentMapper.create(department);

    }

    @Override
    public void createRequire(RequDto requDto) {
        Department department = getDepartmentByName(requDto.getDepartmentName());
        for (String subjectName : requDto.getSubjectNames()) {
            Subject subject = subjectService.getByName(subjectName);
            Require require = new Require();
            require.setSubject_id(subject.getId());
            require.setDepartment_id(department.getId());
            departmentMapper.createRequire(require);
        }
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentMapper.getByName(name);
    }

    @Override
    public Department getById(Long id) {
        return departmentMapper.getById(id);
    }


}
