package org.example.domain;

public class User {
    private Long id;
    private String name;
    private String department;

//    public User(Long id, String name, String department) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
