package com.Example15;

public class Exam153 {

    public static void main(String[] args) {
        try {
            String Three = "sdf10";
            int i = Integer.parseInt(Three);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException 예외를 catch 하였습니다");
            System.out.println("---- stack trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stack trace (여기까지) ----");
        }
    }

}
