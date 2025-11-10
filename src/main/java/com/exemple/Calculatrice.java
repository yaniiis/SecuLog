package com.exemple;

public class Calculatrice {

    public int additionner(int a, int b) {
        return a + b;
    }

    public int soustraire(int a, int b) {
        return a - b;
    }

    public int multiplier(int a, int b) {
        return a * b;
    }

    public double diviser(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro interdite !");
        }
        return (double) a / b;
    }
}
