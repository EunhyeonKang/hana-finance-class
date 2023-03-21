package com.testcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.Example18.DownCounter;
import com.Example18.UpCounter;

public class CounterTest {

    @Test
    public void getUpCountTest() {
        // count 값이 초기값과 같아야 함
        UpCounter counter = new UpCounter();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void setUpCountTest() {
        UpCounter counter = new UpCounter();
        counter.setCount(10);
        assertEquals(10, counter.getCount());
    }

    @Test
    public void upIncrementTest() {
        // increment() 메소드를 실행한 후 count 값이 1 증가해야 함
        UpCounter counter = new UpCounter();
        counter.setCount(10);
        counter.count();
        assertEquals(11, counter.getCount());
    }

    @Test
    public void getDownCountTest() {
        // count 값이 초기값과 같아야 함
        DownCounter counter = new DownCounter();
        assertEquals(0, counter.getCount());
    }

    @Test
    public void setDownCountTest() {
        DownCounter counter = new DownCounter();
        counter.setCount(10);
        assertEquals(10, counter.getCount());
    }

    @Test
    public void downIncrementTest() {
        // increment() 메소드를 실행한 후 count 값이 1 증가해야 함
        DownCounter counter = new DownCounter();
        counter.setCount(10);
        counter.count();
        assertEquals(9, counter.getCount());
    }
}