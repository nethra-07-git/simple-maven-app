
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestThreeTest {

    @Test
    public void testLargestIsFirst() {
        assertEquals(30, new LargestThree().findLargest(30, 20, 10));
    }

    @Test
    public void testLargestIsSecond() {
        assertEquals(50, new LargestThree().findLargest(10, 50, 20));
    }

    @Test
    public void testLargestIsThird() {
        assertEquals(90, new LargestThree().findLargest(10, 20, 90));
    }

    @Test
    public void testEqualNumbers() {
        assertEquals(5, new LargestThree().findLargest(5, 5, 5));
    }
}

