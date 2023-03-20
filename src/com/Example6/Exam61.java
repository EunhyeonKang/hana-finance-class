package com.Example6;

public class Exam61 {
    public static void main(String[] args) throws Exception {
        System.out.println("3초간 기다림!");
        try {
            Thread.sleep(3000);
        }catch(InterruptedException e) {
            System.out.println("에러 발생! 종료합니다.");
            System.exit(1);
        }
    }
}
