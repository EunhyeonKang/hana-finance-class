package com.Example7;

import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final static int MAX_HP = 50;
    int mp = 10;
    final static int MAX_MP = 10;
    Random random = new Random();

    Cleric() {
    }

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, 10); // 최대 MP로 초기화
    }

    Cleric(String name) {
        this(name, 50, 10); // 최대 HP, 최대 MP로 초기화
    }

    // 마법
    void selfAid() {
        this.mp -= 5;
        this.hp = MAX_HP;
    }

    public int pray(int second) {
        // 회복량은 기도한 시간(초)에 랜덤하게 0 ~ 2포인트의 보정을 한 양이다 (3초 기도하면 회복량은 3 ~ 5포인트).
        int retouch = random.nextInt(3);
        int recovery = 0;

        if (this.mp + retouch <= MAX_MP) {
            recovery = (second + retouch);
            this.mp += recovery;
        } else {
            this.mp = MAX_MP;
        }

        return recovery;
    }
    /*
     * 유림동생이 간단하게 푼 pray int pray(int sec) { int initMP = this.mp; int recovery = new
     * Random().nextInt(3) + sec; mp += recovery; if (mp > MAX_MP) { mp = MAX_MP; } return mp -
     * initMP; }
     */
}
