package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LovelyTest {

    Lovely lovely = new Lovely();

    @Test
    public void testIsLovely_noRepetitions_true() {
        assertTrue(lovely.isLovely(10));
    }

    @Test
    public void testIsLovely_twoRepetition_true() {
        assertTrue(lovely.isLovely(11));
    }

    @Test
    public void testIsLovely_threeRepetition_false() {
        assertFalse(lovely.isLovely(111));
    }

    @Test
    public void testIsLovely_1_true() {
        assertTrue(lovely.isLovely(1102));
    }

    @Test
    public void testIsLovely_3_false() {
        assertFalse(lovely.isLovely(11102));
    }

    @Test
    public void testIsLovely_4_true() {
        assertTrue(lovely.isLovely(10212));
    }

    @Test
    public void testIsLovely_5_false() {
        assertFalse(lovely.isLovely(31133));
    }

    @Test
    public void testIsLovely_6_false() {
        assertFalse(lovely.isLovely2(31133));
    }

    @Test
    public void testIsLovely_7_false() {
        assertFalse(lovely.isLovely3(31133));
    }

}
