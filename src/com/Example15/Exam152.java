package com.Example15;

public class Exam152 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 예외를 catch 하였습니다");
            System.out.println("---- stack trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stack trace (여기까지) ----");
        }
    }
}
