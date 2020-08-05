package numbs;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommonEndTest {

    @Test
    public void testCommonEnd_1() {
        CommonEnd c = new CommonEnd();
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{1, 2, 3};
        boolean bo = c.commonEnd(a,b);
        assertTrue(bo);
    }

    @Test
    public void testCommonEnd_2() {
        CommonEnd c = new CommonEnd();
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{2, 3, 4};
        boolean bo = c.commonEnd(a,b);
        assertTrue(bo);
    }

    @Test
    public void testCommonEnd_3() {
        CommonEnd c = new CommonEnd();
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{1, 3, 4};
        boolean bo = c.commonEnd(a,b);
        assertTrue(bo);
    }

    @Test
    public void testCommonEnd_4() {
        CommonEnd c = new CommonEnd();
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{2, 3, 5};
        boolean bo = c.commonEnd(a,b);
        assertFalse(bo);
    }

}
