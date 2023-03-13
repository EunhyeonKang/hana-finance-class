package com.Example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz52 {
    public static int[] arithmeticSequence(int n, int m) {
        int[] result = new int[10];
        // m+n*i
        for (int i = 0; i < 10; i++) {
            result[i] = n + i * m;
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        // arithmeticSequence(n, m);
        StringBuilder sb = new StringBuilder();

        for (int sequence : arithmeticSequence(n, m)) {
            sb.append(sequence + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}
