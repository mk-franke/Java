package com.telran;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoDivisorsTest {

    TwoDivisors twoDivisors = new TwoDivisors();
    List<Integer> nums = Arrays.asList(2, 3, 8, 9, 9, 15, 20);

    @Test
    public void testIsDivided_NEquals1_false() {
        assertFalse(twoDivisors.isDivisor(nums, 1));
    }

    @Test
    public void testIsDivided_NEquals7_false() {
        assertFalse(twoDivisors.isDivisor(nums, 7));
    }

    @Test
    public void testIsDivided_NEquals75_false() {
        assertFalse(twoDivisors.isDivisor(nums, 75));
    }

    @Test
    public void testIsDivided_NEquals64_false() {
        assertFalse(twoDivisors.isDivisor(nums, 64));
    }

    @Test
    public void testIsDivided_NEquals27_true() {
        assertTrue(twoDivisors.isDivisor(nums, 27));
    }

    @Test
    public void testIsDivided_NEquals120_true() {
        assertTrue(twoDivisors.isDivisor(nums, 120));
    }

    @Test
    public void testIsDivided_NEquals135_true() {
        assertTrue(twoDivisors.isDivisor(nums, 135));
    }

    @Test
    public void testIsDivided_NEquals180_true() {
        assertTrue(twoDivisors.isDivisor(nums, 180));
    }

}
