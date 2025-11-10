package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.exemple.Primenumber;

public class PrimenumberTest {

    @Test
    void testFact() {
        assertEquals(true, Primenumber.isPrime(0));
    }


}
