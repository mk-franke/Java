package com.company;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class TransformerTest {

    @Test
    public void testWordTransform_1() {
        String input = "abc defG ikl";
        String expected = "ABC defG IKL";
        Predicate<String> checkLength = s -> s.length() == 3;
        Function<String, String> toUpper = String::toUpperCase;
        String actual = Transformer.transform(input, checkLength, toUpper);
        assertEquals(expected, actual);
    }

    @Test
    public void testWordTransform_2() {
        String input = "abc defG ikl";
        String expected = "ABC defG IKL";
        String actual = Transformer.transform(input);
        assertEquals(expected, actual);
    }

}
