package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void testSevenTerms() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8};
        assertArrayEquals(expected,
                new Fibonacci().generateSeries(7));
    }

    @Test
    public void testOneTerm() {
        assertArrayEquals(
                new int[]{0},
                new Fibonacci().generateSeries(1));
    }

    @Test
    public void testZeroTerms() {
        assertArrayEquals(
                new int[]{},
                new Fibonacci().generateSeries(0));
    }
}
