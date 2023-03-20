package com.Example17;

import java.io.Serializable;

public class Employee implements Serializable{

    private static final long serialVersionUID = -3032895417029868231L;
    String name;
    int age;
    public Employee() {
        
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
    
}
