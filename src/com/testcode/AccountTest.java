package com.testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import com.Example18.Account;

public class AccountTest {
//
//    @Test
//    public void test() {
//        fail("Not yet implemented");
//    }
//    
    @Test
    public void 생성자_테스트() {
        Account account = new Account("홍길동",30000);
        assertEquals("홍길동", account.getOwner());
        assertEquals(30000, account.getBalance());
    }
    
    @Test
    public void transfer_test() {
        Account account = new Account("홍길동", 30000);
        Account account2 = new Account("한석봉",0);
        account.transfer(account2, 10000);
        assertEquals(20000, account.getBalance());
        assertEquals(10000, account2.getBalance());
        
        Account account3 = new Account("한석봉(가짜)",0);
        account3.transfer(account, 20000);
        account3.transfer(account3, 0);
    }
    
    @Test(expected= IllegalArgumentException.class)
    public void throwsExceptionWithTwoCharName() {
        
    }
}
