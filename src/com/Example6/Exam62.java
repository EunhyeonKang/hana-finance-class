package com.Example6;

public class Exam62 {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
