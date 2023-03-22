package com.Example19;

public class DeadlockExample {
    final Object resource1 = "resource1";
    final Object resource2 = "resource2";
    Thread thread1 = new Thread(() -> {
        synchronized (resource1) {
            System.out.println("Thread 1 : locked resouce1");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
                System.out.println("Thread 2 : locked resouce2");
            }
        }
    });
    Thread thread2 = new Thread(() -> {
        synchronized (resource2) {
            System.out.println("Thread 2 : locked resouce2");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e2) {
                System.out.println("Thread 2 : locked resouce1");
            }
        }
    });


}
