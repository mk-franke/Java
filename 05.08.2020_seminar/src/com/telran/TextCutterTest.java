package com.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCutterTest {

    TextCutter textCutter = new TextCutter();
    String text = "Hello world";

    @Test
    public void testCut_1() {
        assertEquals("Hello", textCutter.cut(text, 5));
    }

    @Test
    public void testCut_2() {
        assertEquals("Hello", textCutter.cut(text, 6));
    }

    @Test
    public void testCut_3() {
        assertEquals("Hello", textCutter.cut(text, 8));
    }

    @Test
    public void testCut_4() {
        assertEquals("Hello world", textCutter.cut(text, 11));
    }

    @Test
    public void testCut_5() {
        assertEquals("", textCutter.cut(text, 4));
    }

}
