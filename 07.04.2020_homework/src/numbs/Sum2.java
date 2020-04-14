package numbs;

public class Sum2 {

    public int sum2(int[] nums) {
        int c = 0;
        if (nums.length >= 2) {
            c = nums[0] + nums[1];
            return c;
        } else if (nums.length < 2) {
            c = nums[0];
            return c;
        } else if (nums.length == 0) {
            return c;
        }
        return c;
    }

}
