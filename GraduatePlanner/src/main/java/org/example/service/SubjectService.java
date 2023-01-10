package org.example.service;


import org.example.domain.Subject;
import org.example.dto.SubjectDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {
    void create(SubjectDto subjectDto);

    List<SubjectDto> getAll();

    Subject getByName(String name);

}
