package com.Example5;

public class Exam53 {

    public static void email(String address, String title, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }

    public static void email(String address, String text) {
        email(address, "제목없음", text);
    }

    public static void main(String[] args) {
        email("keh0469@naver.com", "자바", "자바는 즐겁다");
        email("keh0469@naver.com", "자바는 즐겁다");
    }
}

