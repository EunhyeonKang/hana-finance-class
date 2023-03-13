package com.Example5;

public class Exam52 {
    public static void email(String title, String address, String text) {
        System.out.println(title + "에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + address);
        System.out.println("본문 : " + text);
    }

    public static void main(String[] args) {
        email("keh0469@naver.com", "자바", "자바는 즐겁다");
    }

}
