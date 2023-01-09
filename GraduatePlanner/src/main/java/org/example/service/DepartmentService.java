package org.example.service;

import org.example.dto.DepartmentDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    void create(DepartmentDto departmentDto);

}
