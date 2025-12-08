package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class P0001_Two_Sum {
    /**
     * 1. Two Sum <a href=>https://leetcode.com/submissions/detail/1113769920/</a><p>
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * <p>
     * Example 1:<p>
     * Input: nums = [2,7,11,15], target = 9<p>
     * Output: [0,1]<p>
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<p>
     * <p>
     * Example 2:<p>
     * Input: nums = [3,2,4], target = 6<p>
     * Output: [1,2]<p>
     * <p>
     * Example 3:<p>
     * Input: nums = [3,3], target = 6<p>
     * Output: [0,1]<p>
     */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        var target = 9;
        int[] ints = new P0001_Two_Sum().twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }

    private int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])
                    && i != map.get(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
