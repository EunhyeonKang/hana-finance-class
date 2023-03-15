package com.Example9;

import com.survivalcoding.game.Kinoko;

public class Hero {
    private String name;
    private int hp=100;
    public Hero() {
        System.out.println("hero 생성자");
    }
    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void run() {
        System.out.println("run");
    }

    public void attack(Kinoko enemy) {
        System.out.println("공격!!");
    }
}
