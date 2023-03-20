package com.Example16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Exam162 {

    public static void main(String[] args) {
        //파일로부터 데이터를 읽어옴
        try (FileInputStream in = new FileInputStream("./data.txt");
            //fileOuputStream을 통해 data.zip파일에 출력
            //GZIPOutputStream을 통해 압축하여 저장
            GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream("data.zip"))) {
            
            byte[] buffer = new byte[1024];
            int len;
            
            while ((len = in.read(buffer)) > 0) {
                // 버퍼에서 0번째 인덱스부터 len길이까지의 바이트 데이터를 출력
                out.write(buffer, 0, len);
            }
            System.out.println("File compressed successfully.");
        } catch (IOException e) {
            System.err.println("Error compressing file: " + e.getMessage());
        }
    }

}
