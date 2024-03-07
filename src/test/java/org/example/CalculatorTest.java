package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private static final double DELTA = 0.01;

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), DELTA);
    }

    @Test
    public void testMean() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.mean(2, 3), DELTA);
    }

    @Test
    public void testSubract(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(5,2), DELTA);

    }
}