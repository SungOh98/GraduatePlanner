package org.example.service;

import org.example.domain.Department;
import org.example.dto.DepartmentDto;
import org.example.repository.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    public void create(DepartmentDto departmentDto) {
        // DTO 객체를 Domain 객체에 담기
        Department department = new Department();
        department.setName(departmentDto.getName());
        department.setMajor_credit(departmentDto.getMajor_credit());
        department.setGeneral_credit(departmentDto.getGeneral_credit());

        departmentMapper.create(department);

    }
}
