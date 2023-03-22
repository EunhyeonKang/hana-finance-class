package com.testcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcLogicTest {
    //없는게 베스트
    List<Integer> nums;

    @Before
    public void setUp() throws Exception {
        nums = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        nums.clear();
    }

    @Test
    public void test() {
        nums.add(10);
        assertEquals((int)nums.get(0), 10);
    }

}
