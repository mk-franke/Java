package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterSwitchTest {

    RegisterSwitch registerSwitch = new RegisterSwitch();

    @Test
    public void testSwap_emptyString_sameEmptyString() {
        assertEquals("", registerSwitch.swap(""));
    }

    @Test
    public void testSwap_oneCapitalLetter_caseSwitched() {
        assertEquals("G", registerSwitch.swap("g"));
    }

    @Test
    public void testSwap_oneSmallLetter_caseSwitched() {
        assertEquals("g", registerSwitch.swap("G"));
    }

    @Test
    public void testSwap_severalLettersOfDifferentCases_caseSwitched() {
        assertEquals("gFklMn", registerSwitch.swap("GfKLmN"));
    }

    @Test
    public void testSwap_severalLettersOfDifferentCasesAndOtherChars_caseSwitchedAndCharsRemained() {
        assertEquals("g_Fkl&Mn", registerSwitch.swap("G_fKL&mN"));
    }

}