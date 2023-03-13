package com.Example5;

public class Exam54 {
    static final double PIE = 3.14;

    public static double calcTriangleAres(double bottom, double height) {
        return (bottom * height) / 2;
    }

    public static double calcCircleArea(double radius) {
        return (Math.pow(radius, 2)) * PIE;
    }

    public static void main(String[] args) {
        System.out.println(calcTriangleAres(5, 4));
        System.out.println(calcCircleArea(6));
    }
}
