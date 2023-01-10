package org.example.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class SubjectDto {

    private int credit;
    private String type;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass()!= o.getClass()) return false;
        if (this == o) return true;
        SubjectDto subjectDto = (SubjectDto) o;
        return credit == subjectDto.credit && type.equals(subjectDto.type) && name.equals(subjectDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(credit, type, name);
    }
}
