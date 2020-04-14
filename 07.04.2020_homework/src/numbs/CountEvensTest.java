package numbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountEvensTest {

    @Test
    public void testCountEvens() {
        CountEvens e = new CountEvens();
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int n = e.countEvens(arr);
        assertEquals(n, 4);
    }

}
