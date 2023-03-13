package com.Example5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz51 {
    public static int checkGroup(int n, int m) {
        if ((n + m) % 2 != 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        if (checkGroup(n, m) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
