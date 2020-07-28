import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testInverse_1() {
        String s = "Hello";
        String exp = "olleH";
        String act = Main.inverse(s);
        assertEquals(act,exp);
    }

    @Test
    public void testInverse_2() {
        String s = "Hello";
        String exp = "olleH";
        String act = Main.inverse2(s);
        assertEquals(act,exp);
    }

    @Test
    public void testChangeCase() {
        String s = "Hello";
        String exp = "hELLO";
        String act = Main.changeCase(s);
        assertEquals(act, exp);
    }

    @Test
    public void testGetDuplicates() {
        List<Integer> numbers = Arrays.asList(-8, 1, -5, 1, 2, 7, 2, 1);
        List<Integer> exp = Arrays.asList(1, 2);
        List<Integer> act = Main.getDuplicates(numbers);
        assertEquals(act, exp);
    }

}