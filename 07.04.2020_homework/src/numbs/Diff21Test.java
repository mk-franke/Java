package numbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Diff21Test {

    @Test
    public void testDiff21_1() {
        Diff21 c = new Diff21();
        int n = c.diff21(10);
        assertEquals(n, 11);
    }

    @Test
    public void testDiff21_2() {
        Diff21 c = new Diff21();
        int n = c.diff21(21);
        assertEquals(n, 0);
    }

    @Test
    public void testDiff21_3() {
        Diff21 c = new Diff21();
        int n = c.diff21(25);
        assertEquals(n, 8);
    }

}
