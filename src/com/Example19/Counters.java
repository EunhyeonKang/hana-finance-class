package com.Example19;

public class Counters {
    private long count = 0;
    public void add(long i) {
        System.out.println("더하기");
        synchronized (this) {
            count += i;
        }
    }

    public void mul(long i) {
        System.out.println("곱하기");
        synchronized (this) {
            count *= i;
        }
    }
}
