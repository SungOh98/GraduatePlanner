package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class RequDto {
    private String departmentName;
    private List<String> subjectNames;

}
