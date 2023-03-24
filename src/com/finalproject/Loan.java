package com.finalproject;

public class Loan {
    private int loanId;         // 대출번호(loanId),
    private String startDate;   // 대출일자(startDate),
    private String endDate;     // 반납일자(dueDate),
    private int overEndDays;    // 연체일수(overdueDays),
    private Book book;          // 대출한 회원 정보(member),
    private Member member;      // 대출한 도서 정보(book)



    // 연체료 계산(calculateOverdueFee),
    // 반납 날짜 지정(setDueDate),
    // 반납 처리(completeLoan),
    // 대출 정보 출력(printLoanInfo)

}
