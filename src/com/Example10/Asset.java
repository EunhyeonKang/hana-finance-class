package com.Example10;

// new를 하면 안될 것 같으니 abstract
public abstract class Asset {
    private String name;
    private int price;
    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
