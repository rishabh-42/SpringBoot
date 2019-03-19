package com.example.boot.answer1and2;

public class Student {
    private String name;

    private String address;

    private int age;

    private int standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "StudentController{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", standard=" + standard +
                '}';
    }

    public Student(String name, String address, int age, int standard) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.standard = standard;
    }



}
