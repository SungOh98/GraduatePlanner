package org.example.domain;

import lombok.Data;

@Data
public class Subject {
    private Long id;
    private int credit;
    private String type;
    private String name;
}
