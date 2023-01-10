package org.example.controller;

import org.example.dto.SubjectDto;
import org.example.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;
    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping
    public String createSubject(@RequestBody SubjectDto subjectDto) {
        subjectService.create(subjectDto);
        return "CREATE SUCCESS!";
    }

    @GetMapping
    public List<SubjectDto> getAllSubject() {
        return subjectService.getAll();
    }
}
