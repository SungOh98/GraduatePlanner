package org.example.dto;

import lombok.Data;

// student-subject 테이블에 매핑되는 DTO
@Data
public class RegisterDto {
    // association
    private StudentDto studentDto;
    private SubjectDto subjectDto;
}
