package com.survivalcoding.game;

public class Hero {
    String name="강은현";
    int hp;
    
    void attack() {}

    void run() {
        System.out.println(name + "은 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는" + this.hp + " 입니다");
    }

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "은 " + sec + "초 앉았다");
        System.out.println("HP가 " + sec + "포인트 회복되었다");
    }

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "은 넘어졌다!");
        System.out.println("5의 데이미!");
    }

    void sleep() {
        this.hp = 100;
        System.out.println(this.name + "은 잠을 자고 회복했다!");
    }
}
