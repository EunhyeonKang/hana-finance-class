package com.finalproject;

import java.util.ArrayList;

public abstract class Member {
    private int memberId;                   // 회원번호(memberId),
    private String name;                    // 이름(name),
    private int age;                        // 나이(age),
    private String phoneNumber;             // 전화번호(phoneNumber),
    private ArrayList<String> loanedBooks;  // 대출한 도서 목록(loanedBooks)
    
    
    // 대출한 도서 추가(addLoanedBook),
    // 대출한 도서 삭제(removeLoanedBook),
    // 회원 정보 출력(printMemberInfo)


}
