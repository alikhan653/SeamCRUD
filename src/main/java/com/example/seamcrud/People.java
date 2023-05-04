package com.example.seamcrud;

public class People {
    private String name;
    private int age;
    private String email;

    // Constructor

    public People(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public People(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}