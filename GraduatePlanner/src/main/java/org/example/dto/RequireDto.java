package org.example.dto;

import lombok.Data;

// department - subject에 매핑되는 DTO
@Data
public class RequireDto {
    // association
    private DepartmentDto departmentDto;
    private SubjectDto subjectDto;
}
