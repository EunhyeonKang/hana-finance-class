package com.finalproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;


public class Member {
    private int memberId;
    private String name;
    private String address;
    private String phoneNumber;
    private Book books;
    private Management management;

    public Member() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, books, memberId, name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Member other = (Member) obj;
        return Objects.equals(address, other.address) && Objects.equals(books, other.books)
                && memberId == other.memberId && Objects.equals(name, other.name)
                && Objects.equals(phoneNumber, other.phoneNumber);
    }

    public Member(int memberId, String name, String address, String phoneNumber, Book books) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.books = books;
    }

    // 대출한 도서 추가 addLoanedBook
    // 대출한 도서 삭제 removeLoanedBook
    // 회원 정보 출력 printMemberInfo
    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + ", address=" + address
                + ", phoneNumber=" + phoneNumber + ", books=" + books + "]";
    }

    // 회원 검색
    public void selectMember() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\member.csv";
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

    // 회원 업데이트
    public void updateMember() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\member.csv";
        Scanner sc = new Scanner(System.in);

        // *****중복제거 필요성 있음*****
        String[] header = new String[] {"번호", "이름", "주소", "전화번호", "구분"};
        int rowToUpdate = sc.nextInt();
        String[] newData = new String[5];

        for (int i = 0; i < header.length; i++) {
            Management.print(header[i]);
            newData[i] = sc.next();
        }
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

    // 회원 삭제
    public void deleteMember() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\member.csv";
        String backupFilePath = "C:\\Users\\DA\\eclipse-workspace\\data\\backup.csv";
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


}
