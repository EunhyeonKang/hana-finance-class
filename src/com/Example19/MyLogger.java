package com.Example19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
    private static MyLogger instance;
    private static BufferedWriter bw;
    public static void main(String[] args) {
        MyLogger logger1 = new MyLogger();
        logger1.log("first");
        MyLogger logger2 = new MyLogger();
        logger2.log("second");
    }
    private MyLogger() {
        try {
            bw = new BufferedWriter(new FileWriter("dummylog.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }

    public synchronized void log(String msg) {
        try {
            bw.write(msg);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}