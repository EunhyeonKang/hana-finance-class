package com.Example10;

public abstract class TangibleAsset extends Asset implements Thing{
    private String name;
    private int price;
    private String color;

   
    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

}
