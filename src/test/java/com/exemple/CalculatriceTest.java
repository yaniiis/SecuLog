package com.exemple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    private final Calculatrice calc = new Calculatrice();

    @Test
    void testAddition() {
        assertEquals(5, calc.additionner(2, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(1, calc.soustraire(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calc.multiplier(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, calc.diviser(5, 2));
    }

    @Test
    void testDivisionParZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.diviser(10, 0));
        assertEquals("Division par zéro interdite !", exception.getMessage());
    }
}
