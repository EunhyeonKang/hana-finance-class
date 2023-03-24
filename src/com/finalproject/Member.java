package com.finalproject;

import java.util.ArrayList;

public abstract class Member {
    private int memberId;                   // 회원번호(memberId),
    private String name;                    // 이름(name),
    private int age;                        // 나이(age),
    private String phoneNumber;             // 전화번호(phoneNumber),
    private String role;                    // 역할(role)
    private ArrayList<String> loanedBooks;  // 대출한 도서 목록(loanedBooks)
    
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public ArrayList<String> getLoanedBooks() {
        return loanedBooks;
    }
    public void setLoanedBooks(ArrayList<String> loanedBooks) {
        this.loanedBooks = loanedBooks;
    }
    public Member(int memberId, String name, int age, String phoneNumber, String role,
            ArrayList<String> loanedBooks) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.loanedBooks = loanedBooks;
    }

    
    // 대출한 도서 추가(addLoanedBook),
    // 대출한 도서 삭제(removeLoanedBook),
    // 회원 정보 출력(printMemberInfo)


}
