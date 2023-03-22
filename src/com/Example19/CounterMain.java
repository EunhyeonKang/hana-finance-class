package com.Example19;

class CounterUpMain extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class CounterMain {
    public static void main(String[] args) {
        CounterUpMain thread1 = new CounterUpMain();
        CounterUpMain thread2 = new CounterUpMain();
        CounterUpMain thread3 = new CounterUpMain();

        thread1.start();
        thread2.start();
        thread3.start();

    }
}


