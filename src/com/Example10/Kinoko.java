package com.Example10;

import com.Example9.Hero;

public class Kinoko implements Life {
    int hp = 50;
    private char suffix;
    //default 생성자 추가
    public Kinoko() {
        
    }
    public Kinoko(char suffix) {
        this.suffix = suffix;
    }
    public void attack(Hero hero) {
        System.out.println("키노코 "+this.suffix+" 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp()-10);
    }
}
