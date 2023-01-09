package org.example.domain;

import lombok.Data;
/*
department 테이블과 1:1로 매칭되는 객체.
 */
@Data
public class Department {
    private Long id;
    private String name;
    private int major_credit;
    private int general_credit;

}
