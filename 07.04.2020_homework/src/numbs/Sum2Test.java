package numbs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum2Test {

    @Test
    public void testSummaryOfArrayElements_1() {
        Sum2 s = new Sum2();
        int[] nums = new int[]{1,2,3,4,5};
        int sum = s.sum2(nums);
        assertEquals(sum, 3);
    }

    @Test
    public void testSummaryOfArrayElements_2() {
        Sum2 s = new Sum2();
        int[] nums = new int[]{1,2};
        int sum = s.sum2(nums);
        assertEquals(sum, 3);
    }

    @Test
    public void testSummaryOfArrayElements_3() {
        Sum2 s = new Sum2();
        int[] nums = new int[]{1};
        int sum = s.sum2(nums);
        assertEquals(sum, 1);
    }

    @Test
    public void testSummaryOfArrayElements_4() {
        Sum2 s = new Sum2();
        int[] nums = new int[0];
        int sum = s.sum2(nums);
        assertEquals(sum, 0);
    }

}
