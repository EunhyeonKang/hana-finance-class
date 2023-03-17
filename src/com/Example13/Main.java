package com.Example13;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int newDay = currentDay + 100;
        calendar.set(Calendar.DAY_OF_MONTH, newDay);

        Date newDate = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String today = dateFormat.format(new Date());
        String formattedDate = dateFormat.format(newDate);
        System.out.println("현재날짜 : " + today);
        System.out.println("100일 뒤 날짜 : " + formattedDate);
        
        Account a = new Account("4649", 1592);
        System.out.println(a.toString());
    }
}
