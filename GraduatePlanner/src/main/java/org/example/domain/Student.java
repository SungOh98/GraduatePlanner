package org.example.domain;
// student 테이블과 1:1 매칭되는 객체
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

    // getter & setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
