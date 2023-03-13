package com.Example4;

import java.util.Scanner;

public class Quiz41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        String result = "";
        String[] str= new String[n];
        
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            if (n == 1 || i == 0) {
                result = str[i];
            } else {
                result += "," + str[i];
            }
        }
        System.out.println("Hello " + result + ".");
    }
}
