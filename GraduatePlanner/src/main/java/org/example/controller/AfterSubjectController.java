package org.example.controller;

import org.example.dto.AfterSubjectDto;
import org.example.dto.RequireDto;
import org.example.service.AfterSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AfterSubjectController {

    private final AfterSubjectService afterSubjectService;

    @Autowired
    public AfterSubjectController(AfterSubjectService afterSubjectService) {
        this.afterSubjectService = afterSubjectService;
    }

    @GetMapping("/after-subject")
    public AfterSubjectDto getAfterSubjectByType(@RequestParam String type, @RequestParam Long id, @RequestParam Long department_id) {
        return afterSubjectService.getAfterSubject(type, id, department_id);
    }

    @GetMapping("/departments/subjects/{id}")
    public RequireDto getAllRequire(@PathVariable Long id) {
        return afterSubjectService.getAllRequire(id);
    }

}
