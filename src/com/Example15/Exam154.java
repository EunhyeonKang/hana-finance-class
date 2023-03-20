package com.Example15;

import java.io.IOException;

public class Exam154 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1); //이상 종료
        }
    }

}
