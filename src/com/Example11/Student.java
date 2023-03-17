package com.Example11;

public class Student implements Comparable<Student>, Cloneable {
    public int age;
    public String name;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name) * -1;
    }
}
