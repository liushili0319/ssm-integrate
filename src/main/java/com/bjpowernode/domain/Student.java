package com.bjpowernode.domain;

public class Student {

    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        System.out.println("hhhh");
        return id;
    }

    public void setId(Integer id) {
        System.out.println("genxin");
        this.id = id;
    }

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
}
