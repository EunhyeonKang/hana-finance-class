package com.Exam17;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
       String str="강은현, 최민영, 최유림";
       StringTokenizer st = new StringTokenizer(str,",");
       while(st.hasMoreTokens()) {
           String token = st.nextToken();
           System.out.println(token);
       }
               
    }

}
