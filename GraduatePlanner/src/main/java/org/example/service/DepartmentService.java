package org.example.service;

import org.example.domain.Department;
import org.example.dto.DepartmentDto;
import org.example.dto.RequDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    void create(DepartmentDto departmentDto);

    void createRequire(RequDto requDto);

    Department getDepartmentByName(String name);

    Department getById(Long id);
}
