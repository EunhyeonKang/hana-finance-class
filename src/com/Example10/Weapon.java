package com.Example10;

public class Weapon extends Item {
    public Weapon() {
        super("noname");
    }
    public Weapon(String name) {
        super(name);
    }

    public Weapon(String name, int price) {
        super(name, price);
    }
}
