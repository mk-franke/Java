package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceFinderTest {

    SubsequenceFinder finder = new SubsequenceFinder();

    @Test
    public void testIsSubsequence_emptyTextEmptyPattern_true() {
        assertTrue(finder.isSubsequence("", ""));
    }

    @Test
    public void testIsSubsequence_anyTextEmptyPattern_true() {
        assertTrue(finder.isSubsequence(" 9", ""));
    }

    @Test
    public void testIsSubsequence_anyTextOneLetterPattern_true() {
        assertTrue(finder.isSubsequence(" a9", "a"));
    }

    @Test
    public void testIsSubsequence_anyTextOneLetterPattern_false() {
        assertFalse(finder.isSubsequence(" 9", "a"));
    }

    @Test
    public void testIsSubsequence_mixedTextMixedPattern_true() {
        assertTrue(finder.isSubsequence("sgtranhbc9999s", "abcs"));
    }

    @Test
    public void testIsSubsequence_mixedTextMixedPattern_false() {
        assertFalse(finder.isSubsequence("sgtranhbc9999s", "absc"));
    }

}
