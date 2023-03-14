package com.Example8;

public class Person {
    String name;
    int age;
    
    Person(String name) {
        this.name = name;

    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
