package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    @Test
    void shouldReturnZeroWhenEmpty() {
        StringCalculator calculator = new StringCalculator();

        assertEquals(0, calculator.add(""));
    }

    @Test
    void shouldReturnSingleNumber() {
        StringCalculator calculator = new StringCalculator();

        assertEquals(5, calculator.add("5"));
    }
}