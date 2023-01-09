package org.example.repository;

import org.example.domain.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentMapper {
    void create(Department department);
}
