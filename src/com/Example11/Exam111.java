package com.Example11;

import java.util.ArrayList;
import com.Example10.Kinoko;
import com.Example10.Life;
import com.Example10.SuperHero;
import com.Example9.Hero;
import com.survivalcoding.game.Wizard;

public class Exam111 {
    public static void main(String[] args) {
//        Hero hero = new Hero();
        Hero hero1 = new SuperHero();
        SuperHero superHero = new SuperHero();
   
        
        Life life = new Wizard();
        Life life1 = new Kinoko();

//        Wizard w = new Wizard();
//        Character c= w;
//        c.fireball(k);
        
//        Slime slime = new Slime();
//        Monster monster = new Slime();
//        Slime.run();
//        monster.run();
        
        X obj = new A();
        obj.a();
        
        Y y1 = new A();
        Y y2 = new B();
        y1.a();
        y2.a();
        
       
        ArrayList<Y> array = new ArrayList<>();
        array.add(new A());
        array.add(new B());
        for(Y arr : array) {
            arr.b();
        }
 
    }

}
