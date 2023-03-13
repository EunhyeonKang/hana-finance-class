package com.Example6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Exam64 {
    public static void main(String[] args) throws IOException {
        // 1. 던질 횟수를 입력해주세요 를 출력한다
        System.out.println("던질 횟수를 입력해주세요");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        // 2. 키보드로부터 long값을 변수 tries 에 입력 받는다
        long tries = Long.parseLong(br.readLine());
        // 3. 정수형 hits 변수를 0으로 초기화 한다
        int hits = 0;
        for (int i = 0; i < tries; i++) {
            // 4. 다트가 꽂히는 좌표 x, y 를 랜덤한 값으로 정하되 범위는 -1 ~ 1 사이의 실수(double) 로 한다
            double x = random.nextDouble() * 2 - 1.0;
            double y = random.nextDouble() * 2 - 1.0;
            // 5. 다트가 꽂힌 좌표가 원 안에 있을 경우 hits 를 증가연산자를 사용하여 1 증가 시킨다
            if (Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2))) <= 1) {
                hits++;
            }
        }
        // 6. 반복이 끝나면 실수형 변수 piEstimate 를 선언과 동시에 PI 값을 계산하여 대입하여 초기화 한다
        double piEstimate = 4 * hits / (double) tries;
        System.out.println(piEstimate);
    }
}
