package com.Example16;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam161 {

    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            // 파일로부터 데이터를 읽어들일 떄 사용 
            // 바이트 단위로 데이터를 읽어들임
            // 상대경로를 사용하여 FileInputStream 생성 - 현재 작업 디렉토리를 기준으로 파일의 경로를 나타내는 방식
            fis = new FileInputStream("./data.txt");
            // 데이터를 쓸 때 사용
            // 바이트 단위로 데이터를 씀
            // 절대경로를 사용하여 FileInputStream 생성 - root 디렉토리부터 시작하여 전체 경로를 나타내는 방식
            fos = new FileOutputStream("C:\\Users\\DA\\test.txt");
            byte[] buffer = new byte[1024];
            int readBytes;
            // read()메소드를 통서 읽어들임
            while ((readBytes = fis.read()) != -1) {
                fos.write(buffer, 0, readBytes);
            }
            System.out.println("파일 복사가 완료되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
