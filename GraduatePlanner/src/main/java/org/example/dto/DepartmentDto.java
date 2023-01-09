package org.example.dto;

public class DepartmentDto {

    private String name;
    private int major_credit;
    private int general_credit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajor_credit() {
        return major_credit;
    }

    public void setMajor_credit(int major_credit) {
        this.major_credit = major_credit;
    }

    public int getGeneral_credit() {
        return general_credit;
    }

    public void setGeneral_credit(int general_credit) {
        this.general_credit = general_credit;
    }
}
