package com.finalproject;

import java.util.Date;
import java.util.Objects;

public class Loan {
	private int loanId;
	private Date startDate;
	private Date endDate;
	private int overEndDays;
	private Member members;
	private Book books;
	//  대출번호(loanId), 
	//  대출일자(startDate), 
	//  반납일자(dueDate), 
	//  연체일수(overdueDays), 
	//  대출한 회원 정보(member), 
	//  대출한 도서 정보(book)
	//  연체료 계산(calculateOverdueFee), 
	//  반납 날짜 지정(setDueDate), 
	//  반납 처리(completeLoan), 
	//  대출 정보 출력(printLoanInfo)

}
