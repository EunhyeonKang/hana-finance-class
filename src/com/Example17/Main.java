package com.Example17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        
        Employee employee = new Employee("홍길동",41);
        FileOutputStream fos;
        
        try {
            fos = new FileOutputStream("company.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
