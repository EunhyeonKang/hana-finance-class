package com.Example17;

import java.io.Serializable;

public class Hero implements Serializable {
    private static final long serialVersionUID = 81923983183821L;
    private String name;
    private int hp;
    private int mp;
    private Sword sword;
    public Hero(String name, int hp, int mp) {
        this.name=name;
        this.hp=hp;
        this.mp=mp;
    }

}
