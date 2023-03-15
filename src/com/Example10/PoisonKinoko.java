package com.Example10;

import com.Example9.Hero;

public class PoisonKinoko extends Kinoko {
    private int poisonNum;

    // 독공격이 되는 것
    public PoisonKinoko(char suffix) {
        super(suffix);
        poisonNum = 5;
    }

    @Override
    public void attack(Hero hero) {
        super.attack(hero);
        if (poisonNum > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() - hero.getHp()/ 5);
            System.out.println(hero.getHp() + "포인트의 데미지");
            poisonNum--;
        }
    }
}
