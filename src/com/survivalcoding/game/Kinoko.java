package com.survivalcoding.game;

public class Kinoko {
    int hp;
    final int LEVEL = 10;
    char suffix;
    Kinoko(){
        
    }
    Kinoko(int hp){
        this.hp = hp;
    }
    void run() {
        System.out.println("괴물 버섯 "+ this.suffix + "는 도망갔다!");
    }
}
