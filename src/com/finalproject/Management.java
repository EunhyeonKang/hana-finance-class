package com.finalproject;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import com.opencsv.CSVWriter;


public class Management {
    private static String filePath;
    private static CSVWriter csvWriter;
    private static Scanner sc;
    private static BufferedWriter writer;
    private static String[] memberInfo;
    private static String[] header;



    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        Management.header = header;
    }

    public Management() {
        filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\member.csv";
        sc = new Scanner(System.in);
        memberInfo = new String[5];
    }

    // 회원가입
    public void registerMember() {
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), "EUC-KR"));
            csvWriter = new CSVWriter(writer);
            header = new String[] {"번호", "이름", "주소", "전화번호", "구분"};
            // 회원 정보 입력
            for (int i = 0; i < header.length; i++) {
                print(header[i]);
                memberInfo[i] = sc.next();
            }
            csvWriter.writeNext(memberInfo);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void print(String header) {
        System.out.println(header + "를 입력하세요");
    }

}
