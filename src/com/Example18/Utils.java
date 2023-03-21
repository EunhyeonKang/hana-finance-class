package com.Example18;

interface Func1 {
    public abstract boolean isOdd(int n);
}


interface Func2 {
    public abstract String addNamePrefix(boolean male, String name);
}


public class Utils {
    public static void main(String[] args) {
        Func1 isOdd = (int n) -> {
            return n % 2 == 1;
        };
        Func2 addNamePrefix = (boolean male, String name) -> {
            if (male == true) {
                return "Mr." + name;
            }
            return "Ms." + name;
        };

        boolean result1 = isOdd.isOdd(3);
        String result2 = addNamePrefix.addNamePrefix(true, "강은현");


        System.out.println(result1 + " " + result2);
    }
}
