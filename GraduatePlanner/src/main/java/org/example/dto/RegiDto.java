package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class RegiDto {
    private String account;
    private List<String> subjectNames;
}
