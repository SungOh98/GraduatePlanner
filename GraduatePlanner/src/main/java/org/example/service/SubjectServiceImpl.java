package org.example.service;

import org.example.domain.Subject;
import org.example.dto.StudentDto;
import org.example.dto.SubjectDto;
import org.example.repository.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{
    private final SubjectMapper subjectMapper;
    @Autowired
    public SubjectServiceImpl(SubjectMapper subjectMapper) {
        this.subjectMapper = subjectMapper;
    }

    public void create(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setName(subjectDto.getName());
        subject.setCredit(subjectDto.getCredit());
        subject.setType(subjectDto.getType());

        subjectMapper.create(subject);

    }

    public List<SubjectDto> getAll() {
        return subjectMapper.getAll();
    }

    public Subject getByName(String name) {
        return subjectMapper.getByName(name);
    }
}
