package com.Example10;

import com.Example9.Hero;

public class Main {
    public static void main(String[] args) {
        //SuperHero superHero = new SuperHero();
        //superHero.run();
        PoisonKinoko poisonKinoko = new PoisonKinoko('A');
        
        Hero hero = new Hero();
        
        poisonKinoko.attack(hero);
    }
}
