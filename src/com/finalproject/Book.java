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


    // 대출 여부 변경(changeLoanStatus),
    // 도서 정보 출력(printBookInfo)

}
