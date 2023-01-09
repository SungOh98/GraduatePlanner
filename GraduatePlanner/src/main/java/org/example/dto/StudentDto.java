package org.example.dto;
// client - controller - service 간의 데이터 전달 객체
public class StudentDto {

    // 멤버 변수들
    // 초기 학점은 0점임 -> 나중에 추가해야 올라가는 형태
    private int current_credits = 0;
    private String account;
    private String password;
    private String student_number;
    private String name;
    private int year;
    // 웹 사이트에서 컴퓨터 공학부라고 부서명을 적는다고 가정
    private String department_name;

    // GETTER / SETTER
    public int getCurrent_credits() {
        return current_credits;
    }

    public void setCurrent_credits(int current_credits) {
        this.current_credits = current_credits;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
}
