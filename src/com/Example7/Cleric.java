package com.Example7;

import java.util.Random;

public class Cleric {
    String name;
    int HP = 50;
    final int maxHP = 50;
    int MP = 6;
    final int maxMP = 10;
    Random random = new Random();

    // 마법
    void selfAid() {
        this.MP -= 5;
        this.HP = maxHP;
    }

    public int pray(int second) {
        // 회복량은 기도한 시간(초)에 랜덤하게 0 ~ 2포인트의 보정을 한 양이다 (3초 기도하면 회복량은 3 ~ 5 포인트).
        int retouch = random.nextInt(3);
        int recovery = 0;

        if (this.MP + retouch <= maxMP) {
            recovery = (second + retouch);
            this.MP += recovery;
        } else {
            this.MP = maxMP;
        }

        return recovery;
    }

    // int pray(int sec) {
    // int initMP = this.mp;
    // int recovery = new Random().nextInt(3) + sec;
    // mp += recovery;
    // if (mp > MAX_MP) {
    // mp = MAX_MP;
    // }
    // return mp - initMP;
    // }
}
