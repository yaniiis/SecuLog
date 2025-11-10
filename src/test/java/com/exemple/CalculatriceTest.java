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
    void testMultiplication() {
        assertEquals(70, calc.multiplier(2, 35));
    }


    @Test
    void testSoustraction() {
        assertEquals(12, calc.soustraire(20, 8));
    }

    @Test
    void testDivision() {
        assertEquals(1, calc.diviser(1, 1));
    }
    
    @Test
    void testDivision0() {
        assertThrows(IllegalArgumentException.class, () -> calc.diviser(2, 0));
    }





}
