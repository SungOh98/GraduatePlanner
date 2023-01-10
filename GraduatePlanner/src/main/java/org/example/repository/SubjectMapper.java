package org.example.repository;

import org.example.domain.Subject;
import org.example.dto.SubjectDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectMapper {
    void create(Subject subject);

    List<SubjectDto> getAll();

    Subject getByName(String name);
}
