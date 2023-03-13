package com.Example3;

import java.util.Scanner;

public class Quiz31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        String result = "";
       // sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (n == 1 || i == 0) {
                result = str;
            } else {
                result += "," + str;
            }
        }
        System.out.println("Hello " + result + ".");
    }
}
