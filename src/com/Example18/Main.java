package com.Example18;

interface MyFunction {
    public abstract int call(int a, int b);

    public static int mul(int x, int y) {
        return x * y;
    }
}


public class Main {
    public static void main(String[] args) {
        // labda expression
        MyFunction func = (int a, int b) -> a + b;
        int result = func.call(5, 3);

       
        int result1 = MyFunction.mul(5, 3);


        System.out.println("5 + 3 = " + result);
        System.out.println("5 * 3 = " + result1);
    }
}
