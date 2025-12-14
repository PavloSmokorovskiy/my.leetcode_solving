package leetcode.quest;

import java.util.Arrays;

public class Q1_Concatenation_of_Array {

    /**
     * Given an integer array nums of length n, you want to create an array ans
     * of length 2n where ans[i] == nums[i] and
     * ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     * <p>
     * Specifically, ans is the concatenation of two nums arrays.
     * <p>
     * Return the array ans.
     * <p>
     * Example 1:
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     * <p>
     * Example 2:
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(new Q1_Concatenation_of_Array().getConcatenation(nums)));
    }

    int[] getConcatenation(int[] nums) {
        var n = nums.length;
        var res = new int[2 * n];
        for (var i = 0; i < 2 * n; i++) res[i] = nums[i % n];
        return res;
    }
}
