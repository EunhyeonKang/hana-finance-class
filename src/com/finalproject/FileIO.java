package com.finalproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class FileIO implements CRUDInterface {
    String[] memberHeader;
    String[] bookHeader;
    Scanner sc;

    public FileIO() {
        memberHeader = new String[] {"번호", "이름", "주소", "전화번호", "구분"};
        bookHeader = new String[] {"번호", "제목", "저자", "출판사", "출판년도", "ISBN", "대출여부", "대출 후 남은 도수 개수"};
        sc = new Scanner(System.in);
    }

    // 가입
    public void registerFile(String fileName) {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\" + fileName + ".csv";
        try {
            Scanner sc = new Scanner(System.in);
            BufferedWriter writer;
            CSVWriter csvWriter;
            writer = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(filePath, true), "EUC-KR"));
            csvWriter = new CSVWriter(writer);

            // 회원 정보 입력
            String[] memberInfo = Input(fileName);

            csvWriter.writeNext(memberInfo);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 전체 조회
    @Override
    public void selectFile(String fileName) {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\" + fileName + ".csv";
        File file = new File(filePath);
        CSVReader reader = null;

        try {
            reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
            String[] line;
            while ((line = reader.readNext()) != null) {
                for (String value : line) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (CsvValidationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // 검색
    @Override
    public boolean selectOneMember(String name, String role) {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\member.csv";
        try {
            // CSV 파일을 읽기 위한 CSVReader 객체 생성
            CSVReader reader =
                    new CSVReader(new InputStreamReader(new FileInputStream(filePath), "EUC-KR"));
            // 특정 행을 선택
            String[] row = reader.readNext(); // 첫 번째 행
            while ((row = reader.readNext()) != null) {
                // 현재 행의 첫 번째 값 출력
                if (name.equals(row[1]) && row[4].equals(role)) {
                    return true;
                }
            }
            // 이름 값 추출

            // CSVReader 객체 닫기
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    // 수정
    @Override
    public void updateFile(String fileName) {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\" + fileName + ".csv";
        Scanner sc = new Scanner(System.in);
        // row값이 -1
        int rowToUpdate = sc.nextInt() - 1;
        String[] newData = Input(fileName);

        File file = new File(filePath);

        try {
            CSVReader reader = null;
            // csv 파일을 읽음
            reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
            List<String[]> lines = reader.readAll();
            reader.close();

            // 수정한 라인에 새로운 데이터로 수정
            lines.set(rowToUpdate, newData);

            // CSV파일을 업데이트
            CSVWriter writer =
                    new CSVWriter(new OutputStreamWriter(new FileOutputStream(filePath), "EUC-KR"));

            writer.writeAll(lines);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // 삭제
    @Override
    public void deleteFile(String fileName, String backupName) {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\" + fileName + ".csv";
        String backupFilePath = "C:\\Users\\DA\\eclipse-workspace\\data\\" + backupName + ".csv";

        try {
            // CSV 파일을 읽어들임
            CSVReader reader =
                    new CSVReader(new InputStreamReader(new FileInputStream(filePath), "EUC-KR"));

            // csv파일의 모든 행열을 lines에 담기
            List<String[]> lines = reader.readAll();

            reader.close();
            Scanner sc = new Scanner(System.in);
            // 삭제할 행을 선택하고 삭제
            int rowToDelete = sc.nextInt(); // 삭제할 행의 인덱스
            lines.remove(rowToDelete);

            // CSV 파일을 업데이트

            CSVWriter writer =
                    new CSVWriter(new OutputStreamWriter(new FileOutputStream(filePath), "EUC-KR"));

            for (String[] line : lines) {
                writer.writeNext(line);
            }
            // 백업 파일 생성
            try (CSVWriter writer1 = new CSVWriter(
                    new OutputStreamWriter(new FileOutputStream(backupFilePath), "EUC-KR"))) {
                writer1.writeAll(lines); // 데이터를 백업 파일에 저장
            }
            writer.flush();
            writer.close();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

    }

    // 라인 입력 로직
    private String[] Input(String name) {
        String[] memberInfo;
        if (name.equals("member")) {
            memberInfo = new String[memberHeader.length + 1];
            for (int i = 0; i < memberHeader.length; i++) {
                UI.print(memberHeader[i]);
                memberInfo[i] = sc.next();
            }
        } else {
            memberInfo = new String[bookHeader.length + 1];
            for (int i = 0; i < bookHeader.length; i++) {
                UI.print(bookHeader[i]);
                memberInfo[i] = sc.next();
            }
        }

        return memberInfo;
    }

}
