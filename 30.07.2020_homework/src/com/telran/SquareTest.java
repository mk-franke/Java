package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square = new Square();

    @Test
    public void testSqr() {
        assertEquals(9, square.sqr(3));
    }

    @Test
    public void testFindSquareRecursive() {
        assertEquals(9, square.findSquareRecursive(3, 2));
    }

    @Test
    public void testFindSquareLoop() {
        assertEquals(9, square.findSquareLoop(3, 2));
    }

}
