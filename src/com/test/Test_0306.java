package com.test;

public class Test_0306 {
    public static void main(String[] arg) {
       String s = "베스트 "+2;
       int i = (int) 3.2;
       int rand = new java.util.Random().nextInt(6)+5; //0~89
       int rand11 = new java.util.Random().nextInt(11)-5; //0~89
       
       System.out.println(rand11);
       System.out.println(s);
       System.out.println(Math.max(10, 20));
       
       System.out.print("이름을 입력해 주세요 : ");
       String name = new java.util.Scanner(System.in).nextLine();
       System.out.println(name);
       System.out.print("나이를 입력해 주세요 : ");
       int age = new java.util.Scanner(System.in).nextInt();
       System.out.println(age);
       
    }
}









