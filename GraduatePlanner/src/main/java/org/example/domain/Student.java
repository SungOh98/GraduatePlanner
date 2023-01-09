package org.example.domain;

import lombok.Data;

// student 테이블과 1:1 매칭되는 객체
@Data
public class Student {
    // 멤버 변수들

    private Long id;
    private int current_credits;
    private String account;
    private String password;
    private String student_number;
    private String name;
    private int year;
    private int department_id;
}
