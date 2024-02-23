package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorTest {

    @Test
    void faktorial() {
        Factor factor = new Factor();
        int actual = factor.faktorial(6);
        int expected = 720;
        assertEquals(expected, actual);
    }
}