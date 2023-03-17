package com.survivalcoding.game;

import com.Example10.Life;

public class Wizard implements Life{
    String name;
    int hp;

    void heal(Hero hero) {
        //hero.hp += 10;
        System.out.println(hero.name + "의 HP를 10회복했다");
    }
}
