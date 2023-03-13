package com.Example3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam35 {
    public static void main(String[] args) {
        // 1.화면에 “[메뉴] 1:검색 2:등록 3:삭제 4:변경 >” 을 표시한다
        System.out.print("[메뉴] :검색 2:등록 3:삭제 4:변경 > ");
        Scanner sc = new Scanner(System.in);
        // 2.키보드로 숫자를 입력하고, 변수 selected 에 대입한다.
        try {
            int selected = sc.nextInt();
            // 3.만약 변수 selected 가 1 이면 “검색합니다", 2이면 “등록합니다", 3이면 “삭제합니다", 4이면 “변경합니다"를 표시한다
            switch (selected) {
                case 1:
                    System.out.println("검색합니다");
                    break;
                case 2:
                    System.out.println("등록합니다");
                    break;
                case 3:
                    System.out.println("삭제합니다");
                    break;
                case 4:
                    System.out.println("변경합니다");
                    break;
                // 4.selected 가 1 부터 4 사이의 값이 아니라면 아무것도 하지 않는다
                default:
            }

        } catch (InputMismatchException e) {
            System.out.println("정상적인 숫자를 입력하세요");
        }
    }
}
