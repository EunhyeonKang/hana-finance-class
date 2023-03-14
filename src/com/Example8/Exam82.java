package com.Example8;

import java.util.ArrayList;

public class Exam82 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        
        persons.add(new Person("홍길동"));
        persons.add(new Person("한석봉"));
        
        for (Person person1 : persons) {
            System.out.println(person1.name);
        }
        
    }
}
