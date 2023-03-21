package com.testcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.Example18.Bank;

public class BankTest {
    @Test(expected = IllegalArgumentException.class)
    public void nameTest() {
        Bank bank = new Bank();
        bank.setName("은현");
        assertEquals("은현", bank.getName());
    }
}
