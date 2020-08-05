package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {

    LCM lcm = new LCM();

    @Test
    public void testFindLCM_0and0_0_1method() {
        assertEquals(0, lcm.findLCM(0, 0));
    }

    @Test
    public void testFindLCM_0and0_0_2method() {
        assertEquals(0, lcm.countLCM(0, 0));
    }

    @Test
    public void testFindLCM_1and1_1_1method() {
        assertEquals(1, lcm.findLCM(1, 1));
    }

    @Test
    public void testFindLCM_1and1_1_2method() {
        assertEquals(1, lcm.countLCM(1, 1));
    }

    @Test
    public void testFindLCM_6and8_24_1method() {
        assertEquals(24, lcm.findLCM(6, 8));
    }

    @Test
    public void testFindLCM_6and8_24_2method() {
        assertEquals(24, lcm.countLCM(6, 8));
    }

    @Test
    public void testFindLCM_4and9_36_1method() {
        assertEquals(36, lcm.findLCM(   4, 9));
    }

    @Test
    public void testFindLCM_4and9_36_2method() {
        assertEquals(36, lcm.countLCM(4, 9));
    }

}
