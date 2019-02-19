package com.jk.model;


import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1867927036193565607L;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String name;
    private Integer age;

}
