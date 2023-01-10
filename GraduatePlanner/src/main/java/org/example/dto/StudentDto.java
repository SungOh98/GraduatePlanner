package org.example.dto;

import lombok.Data;

// client - controller - service 간의 데이터 전달 객체
@Data
public class StudentDto {

    // 멤버 변수들
    // 초기 학점은 0점임 -> 나중에 추가해야 올라가는 형태
    private int current_credits = 0;
    private String account;
    private String password;
    private String student_number;
    private String name;
    private int year;
    private String departmentName;

}
