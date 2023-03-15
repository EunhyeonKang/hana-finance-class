package com.Example10;

public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
        hp = 100;
    }
    
    public abstract void attack(Kinoko kinoko) ;

    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void run() {
        System.out.println("도망쳤다.");
    }
}
