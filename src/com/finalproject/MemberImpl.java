package com.finalproject;

import java.util.ArrayList;

public class MemberImpl extends Member{
    public MemberImpl() {
        
    }
    public MemberImpl(String memberId) {
        super(memberId);
    }
    public MemberImpl(String memberId, String name, int age, String phoneNumber, String role,
            ArrayList<String> loanedBooks) {
        super(memberId, name, age, phoneNumber, role, loanedBooks);
        // TODO Auto-generated constructor stub
    }

}
