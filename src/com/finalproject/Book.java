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

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String pulisher;
    private String year;
    private boolean isbn;
    private boolean isLoaned;

    public Book() {

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isIsbn() {
        return isbn;
    }

    public void setIsbn(boolean isbn) {
        this.isbn = isbn;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookId, isLoaned, isbn, pulisher, title, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && bookId == other.bookId
                && isLoaned == other.isLoaned && isbn == other.isbn
                && Objects.equals(pulisher, other.pulisher) && Objects.equals(title, other.title)
                && Objects.equals(year, other.year);
    }

    public Book(int bookId, String title, String author, String pulisher, String year, boolean isbn,
            boolean isLoaned) {
        super();
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.pulisher = pulisher;
        this.year = year;
        this.isbn = isbn;
        this.isLoaned = isLoaned;
    }

    // 대출 여부 변경 changeLoanStatus
    // 도서 정보 출력 printBookInfo List로 출력해야돼
    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", pulisher="
                + pulisher + ", year=" + year + ", isbn=" + isbn + ", isLoaned=" + isLoaned + "]";
    }

    public void initBook() {

    }

    public void selectBook() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\book.csv";
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

    public void insertBook() {
        // TODO Auto-generated method stub

    }

    public void updateBook() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\book.csv";
        Scanner sc = new Scanner(System.in);

        // *****중복제거 필요성 있음*****
        String[] header = new String[] {"번호", "제목", "저자", "출판사", "년도", "isbn", "대출여부"};
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

    public void deleteBook() {
        String filePath = "C:\\Users\\DA\\eclipse-workspace\\data\\book.csv";
        String backupFilePath = "C:\\Users\\DA\\eclipse-workspace\\data\\backup_book.csv";
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
