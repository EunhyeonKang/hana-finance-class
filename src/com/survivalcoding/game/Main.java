package com.survivalcoding.game;

public class Main {
    public static void main(String[] args) {
        int[] dsfdsfsd = {100, 200, 300};

        // 용사 생성
        Hero hero = new Hero();
        hero.run();
        // 생성된 용사에게 최초의 HP와 이름을 설정
        hero.name = "최민영";
        hero.hp = 100;
        hero.run();

        Sword sword = new Sword();
        sword.name = "불의 검";
        sword.damage = 10;

        hero.name = "김영웅";
        hero.hp = 100;
        hero.sword = sword;
        System.out.println("현재의 무기는 " + hero.sword.name);

        Hero hero1 = new Hero();
        hero1.name = "스랄";
        hero1.hp = 100;

        Hero hero2 = new Hero();
        hero2.name = "아서스";
        hero2.hp = 100;

        Wizard wizard = new Wizard();
        wizard.name = "제이나";
        wizard.hp = 50;

        wizard.heal(hero1);
        wizard.heal(hero2);
        wizard.heal(hero2);

        Hero hero3 = new Hero("슈퍼맨", 123);
        System.out.println(hero3.name + " " + hero.hp);



    }

}
