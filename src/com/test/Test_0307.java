package com.test;

import java.util.Scanner;

public class Test_0307 {
    public static void main(String[] args) {
        System.out.println("시작");
        Scanner sc = new Scanner(System.in);
        System.out.println("화장실 문이 잠겨 있다");
        int fortune = sc.nextInt();
        switch (fortune) {
            case 1:
                System.out.println("대길");
                break;
            case 2:
                System.out.println("중길");
                break;
            case 3:
                System.out.println("길");
                break;
            default:
                System.out.println("흉");
                break;
        }
    }
}
