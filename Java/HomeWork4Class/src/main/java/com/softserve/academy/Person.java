package com.softserve.academy;

public class Person {
    private String name, birthYear;
    private int age;
    public int count;

    public Person(){
        count++;
    }

    public Person(String name, String birthYear){
        this.name = name;
        this.birthYear = birthYear;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

}
