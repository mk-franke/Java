package strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {

    @Test
    public void testNonStart() {
        NonStart s = new NonStart();
        String ns = s.nonStart("ABA", "bcb");
        assertEquals(ns, "BAcb");
    }

}
