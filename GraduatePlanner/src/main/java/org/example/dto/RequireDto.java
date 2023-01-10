package org.example.dto;

import lombok.Data;

import java.util.List;

// department - subject에 매핑되는 DTO
@Data
public class RequireDto {
    // association
    private String departmentName;
    private List<SubjectDto> subjectList;
}
