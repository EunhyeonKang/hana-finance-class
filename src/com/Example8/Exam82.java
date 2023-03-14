package com.Example8;

import java.util.ArrayList;

public class Exam82 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        
        persons.add(new Person("최유림"));
        persons.add(new Person("최민영"));
        
        for (Person person1 : persons) {
            System.out.println(person1.name);
        }
        
    }
}
