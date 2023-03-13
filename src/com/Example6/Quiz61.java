package com.Example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz61 {
    public static void solution(long a, long b, long r, int n) {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        long a = Long.parseLong(line[0]);
        long b = Long.parseLong(line[1]);
        long R = Long.parseLong(line[2]);
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            String[] l = br.readLine().split(" ");
            int x = Integer.parseInt(l[0]);
            int y = Integer.parseInt(l[1]);
            System.out.println((x-a)+(y-b));
            if((x-a)+(y-b)>=R) {
                System.out.println("silent");
            }else {
                System.out.println("noisy");
            }
        }
        solution(a, b, R, N);
    }



}

