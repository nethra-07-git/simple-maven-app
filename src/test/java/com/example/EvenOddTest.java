
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOddTest {

    @Test
    public void testEvenNumber() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Even", obj.checkNumber(4));
    }

    @Test
    public void testOddNumber() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Odd", obj.checkNumber(7));
    }

    @Test
    public void testZero() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Even", obj.checkNumber(0));
    }
}
