package com.Example18;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLImage {
    public static void main(String[] args) {
        URL url;
        String fileName = "favicon.ico";
        try {
            // url연결을 생성
            url = new URL("https://alimipro.com/favicon.ico");
            // InputStream: 바이트 단위로 데이터를 읽어들이는 스트림 클래스
            // URL.openStream(): 주어진 URL에서 데이터를 읽어들이기 위한 메서드
            InputStream inputStream = url.openStream();

            // ByteArrayOutputStream 클래스를 사용하여 메모리에 저장
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            //
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            // toByteArray() 메소드를 사용하여 byte 배열로 변환합니다.
            byte[] imageBytes = outputStream.toByteArray();
            FileOutputStream fos = new FileOutputStream(fileName);
            
            fos.write(imageBytes);
            fos.close();
            inputStream.close();
            outputStream.close();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
