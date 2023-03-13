package com.Example2;

import java.util.Random;
import java.util.Scanner;

public class Exam23 {
    public static void main(String[] args) {
        System.out.println("점을 보세요");
        // 이름 입력
        System.out.println("이름을 입력해 주세요");
        String name = new Scanner(System.in).nextLine();
        // 나이 입력
        System.out.println("나이를 입력해 주세요");
        String ageString = new Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        // 운세번호 랜덤
        Random rand = new Random();
        int fortune = rand.nextInt(3) + 1;

        System.out.println("점꾀가 나왔습니다!");
        System.out.println(age + " 살의 " + name + "씨, 당신의 운세번호는 " + fortune + "입니다");
        System.out.println("1:대박 2:중박 3:보통 4:망");
    }
}

