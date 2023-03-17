package com.survivalcoding.game;

import com.Example10.Life;

public class Kinoko implements Life{
    int hp;
    final int LEVEL = 10;
    char suffix;
    public Kinoko(){
        
    }
    public Kinoko(int hp){
        this.hp = hp;
    }
    void run() {
        System.out.println("괴물 버섯 "+ this.suffix + "는 도망갔다!");
    }
}
