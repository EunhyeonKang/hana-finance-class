package com.Example6;

public class StringProcess {
    public static void main(String[] args) {

        String str = "HELLO".substring(2, 4);
        System.out.println(str);
        // String은 절대 바뀌지 않아
        System.out.println(str.replace("LL", "XX"));
        System.out.println(str);
        String s1 = "1,2,3";
        String splited[] = s1.split(",");
        for (String s : splited) {
            System.out.println(s);
        }
        String s2 = "HELLO";

        System.out.println(s2.indexOf("E"));
        System.out.println(s2.lastIndexOf("L"));

        String s3 = "JAVA";
        String s4 = "java";
        System.out.println(s3.equalsIgnoreCase(s4));
        s3.length();
        s3.isEmpty();


        String s5 = "Java and JavaScript";
        s5.contains("Java");
        s5.endsWith("Java");
        s5.indexOf("Java");
        s5.contains("Java");

        String s6 = "JAVA";
        System.out.println(s6.toLowerCase());
        System.out.println(s6);
    }


}
