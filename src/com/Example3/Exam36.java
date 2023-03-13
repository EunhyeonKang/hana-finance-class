package com.Example3;

import java.util.Random;
import java.util.Scanner;

public class Exam36 {
    public static void main(String[] args) {
        // 1.화면에 “[숫자 맞추기 게임]” 을 표시한다
        System.out.println("[숫자 맞추기 게임]");
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // 2.0 부터 9 까지의 정수 중에서 랜덤하게 수를 1개 생성해서 변수 ans 에 대입한다
        int ans = random.nextInt(10);
        // 3.for 문을 이용해 “5회 반복 하는 루프"를 만든다. 아래의 4. ~ 7. 은 루프 안에 기술 한다
        for (int i = 0; i < 5; i++) {
            // 4.화면에 “0 ~ 9 사이의 숫자를 입력 하세요” 를 표시한다
            System.out.println("0 ~ 9 사이의 숫자를 입력하세요");
            // 5.숫자를 입력해, 변수 num 에 대입한다
            int num = sc.nextInt();
            if (num == ans) {
                // 6.만약 변수 num 이 변수 ans 와 같으면 “정답!” 이라고 화면에 표시하고 반복을 종료
                System.out.println("정답");
                break;
            } else {
                // 7.만약 변수 num 이 변수 ans 와 같지 않으면 “다릅니다"를 표시한다
                System.out.println("다릅니다");
            }
        }
        // 8.반복 블록의 바깥에, “게임을 종료합니다" 라고 화면에 표시한다
        System.out.println("게임을 종료합니다");
    }
}
