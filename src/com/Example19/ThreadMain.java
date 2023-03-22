package com.Example19;

import java.util.Scanner;



public class ThreadMain {

    public static void main(String[] args) {
        System.out.println("Thread : " + Thread.currentThread().getName());
        System.out.println("아무거나 입력");
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println("Thread : " + Thread.currentThread().getName() + " " + i);
                    sb.append(i);
                    Thread.sleep(8000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }).start();



        sc.nextLine();
    }

}
