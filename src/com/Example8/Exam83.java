package com.Example8;

import java.util.HashMap;
import java.util.Map;

public class Exam83 {
    public static void main(String[] args) {
        Person hong = new Person("홍길동", 20);
        Person han = new Person("한석봉", 25);
        Map<String, Integer> personMap = new HashMap<String, Integer>();
        personMap.put(hong.name, hong.age);
        personMap.put(han.name, han.age);

        for (String name : personMap.keySet()) {
            int age = personMap.get(name);
            System.out.println(name + "의 나이는" + age + "살");
        }
    }
}
