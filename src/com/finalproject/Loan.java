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
    
    public int getLoanId() {
        return loanId;
    }
    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public int getOverEndDays() {
        return overEndDays;
    }
    public void setOverEndDays(int overEndDays) {
        this.overEndDays = overEndDays;
    }
    public Member getMembersO() {
        return members;
    }
    public void setMembersO(Member membersO) {
        this.members = membersO;
    }
    public Book getBooks() {
        return books;
    }
    public void setBooks(Book books) {
        this.books = books;
    }
    
    
    @Override
    public int hashCode() {
        return Objects.hash(books, endDate, loanId, members, overEndDays, startDate);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Loan other = (Loan) obj;
        return Objects.equals(books, other.books) && Objects.equals(endDate, other.endDate) && loanId == other.loanId
                && Objects.equals(members, other.members) && overEndDays == other.overEndDays
                && Objects.equals(startDate, other.startDate);
    }
    public Loan(int loanId, Date startDate, Date endDate, int overEndDays, Member members, Book books) {
        this.loanId = loanId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.overEndDays = overEndDays;
        this.members = members;
        this.books = books;
    }
    
    // 연체료 계산
    // 반납 날짜 지정 setEndDate
    // 반납 처리 complateLoan
    // 대출 정보 출력 printLoanInfo
    
    @Override
    public String toString() {
        return "Loan [loanId=" + loanId + ", startDate=" + startDate + ", endDate=" + endDate + ", overEndDays="
                + overEndDays + ", membersO=" + members + ", books=" + books + "]";
    }
    
    
}
