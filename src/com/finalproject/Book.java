package com.finalproject;

public abstract class Book {
    private int bookId;         // 도서번호(bookId),
    private String title;       // 도서명(title),
    private String author;      // 저자(author),
    private String pulisher;    // 출판사(publisher),
    private String year;        // 출판년도(year),
    private boolean isbn;       // ISBN(ISBN),
    private boolean isLoaned;   // 대출여부(isLoaned)
    private int bookCount;      // 대출 후 남은 도서 개수(bookCount);
    
    
    public Book(int bookId, String title, String author, String pulisher, String year, boolean isbn,
            boolean isLoaned, int bookCount) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.pulisher = pulisher;
        this.year = year;
        this.isbn = isbn;
        this.isLoaned = isLoaned;
        this.bookCount = bookCount;
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
    public int getBookCount() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
    
    // 대출 여부 변경(changeLoanStatus),
    // 도서 정보 출력(printBookInfo)

}
