package org.example.repository;

import org.example.domain.Department;
import org.example.domain.Require;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentMapper {
    void create(Department department);

    Department getByName(String name);

    void createRequire(Require require);

    Department getById(Long id);
}
