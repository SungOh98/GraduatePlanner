package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class AfterSubjectDto {
    private int afterCredit;
    private List<SubjectDto> subjectDtoList;
}
