package com.Example14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class StudentNameAscComarator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class StudentIdAscComarator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "강은현"));
        list.add(new Student(2, "이은현"));
        list.add(new Student(3, "최은현"));
        list.add(new Student(4, "오은현"));
        list.add(new Student(5, "한은현"));
        
        list.sort(new StudentIdAscComarator());     //1
        list.sort(new Comparator<Student>() {       //2
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //1. 이게 더 좋아
        //  ㄴ 메서드만 수정하면 됨
        //  ㄴ 알고리즘은 2
    }
}
