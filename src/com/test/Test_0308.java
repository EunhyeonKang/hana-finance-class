package com.test;

public class Test_0308 {
    // 범위가 벗어날 때 오류나는 예시
    public static void main(String[] args) {
        // 배열은 0~4까지 존재
        // int[] scores = {20, 30, 50, 80, 93, 100, 80, 90, 80};
        // int sum = 0;
        // /*
        // * for (int i = 0; i < scores.length; i++) { sum += scores[i]; }
        // */
        //
        // for (int score : scores) {
        // sum += score;
        // }
        // int average = sum / scores.length;
        //
        // System.out.println("총점 : " + sum);
        // System.out.println("평균 : " + average);
        //
        //
        // int[] a = {1, 2, 3};
        // int[] b = a;
        //
        // b[0] = 100;
        // System.out.println(a[0]);
        //
        // if(true) {
        // int[] aaa = {1};
        // }
        //


        // int[] a = {1, 2, 3};
        // int[] b = a;
        // a = null; // 참조 제거
        // System.out.println(b[0]);

        // int[][] scores = {
        // {10, 20, 30},
        // {30, 40, 50}
        // };
        // System.out.println(scores.length);
        // System.out.println(scores[0].length);

        // 초기화
        int[] score = new int[5];
        // 배열 길이
        int count = score.length;
        // new 생략
        int[] scores = {1, 2, 3, 4};
        // 배열의 요소에 값을 대입
        scores[1] = 30;
        // 문자열 길이
        String str = "ehkang";
        int sCount = str.length();

        System.out.println("요소의 수 : " + count); // 5
        for (int s : scores) {
            System.out.println("score 값 : " + s); // 1 30 3 4
        }
        System.out.println("문자열 길이 : " + sCount); // 6



    }
}
