package numbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShiftLeftTest {

    @Test
    public void testShiftLeft(){
        ShiftLeft sl = new ShiftLeft();
        int[] x = new int[]{2,4,1,6,8,7};
        int[] nsl = sl.shiftLeft(x);
        assertEquals(nsl, new int[]{4,1,6,8,7,2});
    }

}
