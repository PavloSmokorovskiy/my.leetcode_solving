package leetcode;

public class P0485_Max_Consecutive_Ones {

    /**
     * Given a binary array nums, return the maximum number
     * of consecutive 1's in the array.
     * <p>
     * Example 1:
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
     * <p>
     * Example 2:
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     */

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(new P0485_Max_Consecutive_Ones().findMaxConsecutiveOnes(nums));
    }

    private int findMaxConsecutiveOnes(int[] nums) {
        var max = 0;
        var count = 0;

        for (var i : nums) {
            if (i == 1) {
                count++;
            } else {
                if (count > max) max = count;
                count = 0;
            }
        }

        if (count > max) max = count;
        return max;
    }
}
