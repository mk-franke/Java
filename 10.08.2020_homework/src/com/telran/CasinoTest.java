package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasinoTest {

    Casino casino = new Casino();

    @Test
    public void testGetNumOfOptimalSteps_1() {
        assertEquals(4, casino.getNumOfOptimalSteps(8, 1));
    }

    @Test
    public void testGetNumOfOptimalSteps_2() {
        assertEquals(8, casino.getNumOfOptimalSteps(31, 4));
    }

}
