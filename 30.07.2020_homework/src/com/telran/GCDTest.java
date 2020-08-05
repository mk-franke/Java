package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    GCD gcd = new GCD();

    @Test
    public void testGCD_1and1_1() {
        assertEquals(1, gcd.findGCD(1,1));
    }

    @Test
    public void testGCD_1and8_1() {
        assertEquals(1, gcd.findGCD(1,8));
        assertEquals(1, gcd.findGCD(8, 1));
    }

    @Test
    public void testGCD_27and8_1() {
        assertEquals(1, gcd.findGCD(27,8));
        assertEquals(1, gcd.findGCD(8, 27));
    }

    @Test
    public void testGCD_24and15_3() {
        assertEquals(3, gcd.findGCD(24,15));
        assertEquals(3, gcd.findGCD(15, 24));
    }

    @Test
    public void testGCD_64and18_2() {
        assertEquals(2, gcd.findGCD(64,18));
        assertEquals(2, gcd.findGCD(18, 64));
    }

    @Test
    public void testGCD2_1and1_1() {
        assertEquals(1, gcd.countGCD(1,1));
    }

    @Test
    public void testGCD2_1and8_1() {
        assertEquals(1, gcd.countGCD(1,8));
        assertEquals(1, gcd.countGCD(8, 1));
    }

    @Test
    public void testGCD2_27and8_1() {
        assertEquals(1, gcd.countGCD(27,8));
        assertEquals(1, gcd.countGCD(8, 27));
    }

    @Test
    public void testGCD2_24and15_3() {
        assertEquals(3, gcd.countGCD(24,15));
        assertEquals(3, gcd.countGCD(15, 24));
    }

    @Test
    public void testGCD2_64and18_2() {
        assertEquals(2, gcd.countGCD(64,18));
        assertEquals(2, gcd.countGCD(18, 64));
    }

}
