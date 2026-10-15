
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorialOfFive() {
        assertEquals(120, new Factorial().findFactorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, new Factorial().findFactorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, new Factorial().findFactorial(1));
    }
}
