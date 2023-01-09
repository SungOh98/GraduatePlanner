package org.example.controller;

import org.example.dto.DepartmentDto;
import org.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public String createDepartment(@RequestBody DepartmentDto departmentDto) {
        departmentService.create(departmentDto);
        return "Create SUCCESS!";
    }
}
