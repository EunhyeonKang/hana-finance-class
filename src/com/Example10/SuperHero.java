package com.Example10;

import com.Example9.Hero;
import com.survivalcoding.game.Kinoko;

public class SuperHero extends Hero {
    private String name = "김영웅";
    private int hp = 100;
    private boolean flying; // 추가한 필드
    // 추가한 메소드

    public void fly() {
        flying = true;
        System.out.println("날았다!");
    }

    // 추가한 메소드
    public void land() {
        flying = false;
        System.out.println("착지했다!");
    }
    
    public SuperHero() {
        System.out.println("Super Hero 생성자");
    }

    @Override
    public void attack(Kinoko enemy) {
        System.out.println("준비운동");
        super.attack(enemy);
        if (flying) {
            System.out.println("추가 공격");
        }
    }


    @Override
    public void run() {
        System.out.println("퇴각했다");
    }

}

