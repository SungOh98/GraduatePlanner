package org.example.repository;

import org.example.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    void create(Student student);

    List<Student> getAll();

    Student getByAccount(String account);

    void update(Student student);

    Student getById(Long id);
}
