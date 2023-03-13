package com.Example4;

public class Exam43 {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3F, 175.0F};
        // 참조하고 있는 주소가 없음
        System.out.println(counts[1]);
        // 범위에 벗어난 요소를 출력하려 함
        System.out.println(heights[2]);
    }
}
