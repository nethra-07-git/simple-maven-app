
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest {

    @Test
    public void testPrimeNumber() {
        assertTrue(new PrimeNumber().isPrime(7));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(new PrimeNumber().isPrime(8));
    }

    @Test
    public void testOneIsNotPrime() {
        assertFalse(new PrimeNumber().isPrime(1));
    }

    @Test
    public void testTwoIsPrime() {
        assertTrue(new PrimeNumber().isPrime(2));
    }
}
