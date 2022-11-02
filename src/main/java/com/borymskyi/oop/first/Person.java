package com.borymskyi.oop.first;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Person {
    private String name;
    private String surName;
    private String patronymicName;
    private boolean retired;
    private int age;

    public Person(String name, String surName, String patronymicName, boolean retired, int age) {
        this.name = name;
        this.surName = surName;
        this.patronymicName = patronymicName;
        this.retired = retired;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", retired=" + retired +
                ", age=" + age +
                '}';
    }
}
