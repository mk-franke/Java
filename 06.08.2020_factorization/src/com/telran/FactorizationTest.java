package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FactorizationTest {

    Factorization factorization = new Factorization();

    @Test
    public void testFind_severalNumbers_0() {
        assertEquals(0, factorization.find(Arrays.asList(3, 4, 5, 7, 8, 9, 10)));
    }

    @Test
    public void testFind_severalNumbers_2() {
        assertEquals(2, factorization.find(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }

    @Test
    public void testFind_severalNumbers_7() {
        assertEquals(7, factorization.find(Arrays.asList(2, 6, 12, 20, 30, 42, 56)));
    }

}
