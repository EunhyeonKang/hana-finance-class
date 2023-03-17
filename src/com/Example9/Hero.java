package com.Example9;

import java.util.Objects;
import com.survivalcoding.game.Kinoko;

public class Hero implements Cloneable {
    public String name;
    private int hp = 100;

    public Hero() {
        System.out.println("hero 생성자");
    }

    public Hero(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void run() {
        System.out.println("run");
    }

    public void attack(Kinoko enemy) {
        System.out.println("공격!!");
    }

    @Override
    public String toString() {
        return "Hero [name=" + name + ", hp=" + hp + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hero other = (Hero) obj;
        return hp == other.hp && Objects.equals(name, other.name);
    }
    @Override
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        return result;
    }

}
