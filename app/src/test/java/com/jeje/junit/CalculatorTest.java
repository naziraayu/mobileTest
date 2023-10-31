package com.jeje.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddSuccess() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10,10);
        assertEquals(20, result);
//        if (result != 30) {
//            throw new RuntimeException("Test gagal");
//        }
    }
}
