package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.exemple.Primenumber;

public class PrimenumberTest {

    @Test
    void is0PrimeNumber() {
        assertEquals(false, Primenumber.isPrime(0));
    }

    @Test
    void is1PrimeNumber() {
        assertEquals(true, Primenumber.isPrime(1));
    }

    @Test
    void is2PrimeNumber() {
        assertEquals(true, Primenumber.isPrime(2));
    }

    @Test
    void is3PrimeNumber() {
        assertEquals(true, Primenumber.isPrime(3));
    }

}
