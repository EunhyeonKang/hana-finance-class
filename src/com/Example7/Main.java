package com.Example7;

public class Main {

    public static void main(String[] args) {

        Cleric cleric = new Cleric();
        new Cleric("아서스", 40, 5);
        new Cleric("아서스", 35);
        new Cleric("아서스");

        cleric.selfAid();
        System.out.println(cleric.pray(4));
    }

}
