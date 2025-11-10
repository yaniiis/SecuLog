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
    void testDivision() {
        assertEquals(2, calc.diviser(2, 0));
    }


}
