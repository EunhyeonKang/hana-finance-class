package com.survivalcoding.game;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] dsfdsfsd = {100,200,300};
        
        // 용사 생성
        Hero hero = new Hero();
        hero.run();
        // 생성된 용사에게 최초의 HP와 이름을 설정
        hero.name = "최민영";
        hero.hp = 100;
        hero.run();
    }

}
