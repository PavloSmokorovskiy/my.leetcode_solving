package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class P0217_Contains_Duplicate {
    /**
     * 217. Contains Duplicate <a href=>https://leetcode.com/problems/contains-duplicate/description/</a><p>
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * <p>
     * Example 1:<p>
     * Input: nums = [1,2,3,1]<p>
     * Output: true<p>
     * <p>
     * Example 2:<p>
     * Input: nums = [1,2,3,4]<p>
     * Output: false<p>
     * <p>
     * Example 3:<p>
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]<p>
     * Output: true<p>
     */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean res = new P0217_Contains_Duplicate().containsDuplicate(nums);
        System.out.println(res);
    }

    private boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return set.size() != nums.length;
    }
}
