package org.example.dto;

import lombok.Data;
import org.example.domain.Student;
import org.example.domain.Subject;

import java.util.List;

// student-subject 테이블에 매핑되는 DTO
@Data
public class RegisterDto {
    // association
    private String studentName;
    private String student_number;
    private int current_credits;
    private List<SubjectDto> subjects;
}
