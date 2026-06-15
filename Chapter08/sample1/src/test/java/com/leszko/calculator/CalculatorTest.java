package com.leszko.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit tests for Calculator class.
 */
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSumNegative() {
        assertEquals(-1, calculator.sum(2, -3));
    }

    @Test
    public void testSumZero() {
        assertEquals(0, calculator.sum(0, 0));
    }
}