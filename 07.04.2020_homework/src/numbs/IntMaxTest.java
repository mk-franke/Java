package numbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntMaxTest {

    @Test
    public void testIntMax_1(){
        IntMax m = new IntMax();
        int n = m.intMax(10, 15, 20);
        assertEquals(n, 20);
    }

    @Test
    public void testIntMax_2(){
        IntMax m = new IntMax();
        int n = m.intMax(10, 25, 20);
        assertEquals(n, 25);
    }

    @Test
    public void testIntMax_3(){
        IntMax m = new IntMax();
        int n = m.intMax(30, 15, 20);
        assertEquals(n, 30);
    }

}
