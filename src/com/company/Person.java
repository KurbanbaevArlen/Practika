package com.company;

public class Person {
    private String name;
    private String status;
    private int age;

    public Person() {

    }

    public Person(String name, String status, int age) {
        this.name = name;
        this.status = status;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Аты: "+name+ ", статусу - "+ status+", жашы - "+age;
    }
}