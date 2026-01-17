package leetcode;

public class P0053_Maximum_Subarray {

    /**
     * 53. Maximum Subarray
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     * <p>
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * <p>
     * Example 2:
     * Input: nums = [1]
     * Output: 1
     * Explanation: The subarray [1] has the largest sum 1.
     * <p>
     * Example 3:
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     */

    public static void main(String[] args) {
        var nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new P0053_Maximum_Subarray().maxSubArray(nums));
    }

    private int maxSubArray(int[] nums) {

        return 0;
    }
}
