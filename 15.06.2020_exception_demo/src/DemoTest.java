import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void test10By5() {
        int a = 10;
        int b = 5;
        Demo.DivisionResult actual = Demo.div(a, b);
        assertEquals(2, actual.result, 0);
        assertTrue(actual.isSuccess);
    }

    @Test
    public void test10By0() {
        int a = 10;
        int b = 0;
        Demo.DivisionResult actual = Demo.div(a, b);
        assertFalse(actual.isSuccess);
    }

    @Test(expected = ArithmeticException.class)
    public void test5By0() {
        int a = 5;
        int b = 0;
        double res = Demo.div2(a, b);
    }

}
