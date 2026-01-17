package leetcode;

import java.util.Arrays;

public class P0645_Set_Mismatch {

    /**
     * You have a set of integers s, which originally contains all the numbers
     * from 1 to n. Unfortunately, due to some error, one of the numbers in s
     * got duplicated to another number in the set, which results in repetition
     * of one number and loss of another number.
     * <p>
     * You are given an integer array nums representing the data status of this set
     * after the error.
     * <p>
     * Find the number that occurs twice and the number that is missing and return
     * them in the form of an array.
     * <p>
     * Example 1:
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     * <p>
     * Example 2:
     * Input: nums = [1,1]
     * Output: [1,2]
     */

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {2, 3, 2};
        int[] nums3 = {2, 2};
        System.out.println(Arrays.toString(new P0645_Set_Mismatch().findErrorNums(nums1)));
    }

    private int[] findErrorNums(int[] nums) {
        var res = new int[2];
        var seen = new boolean[nums.length + 1];

        for (var i : nums) {
            if (!seen[i]) seen[i] = true;
            else res[0] = i;
        }

        for (var i = 0; i < seen.length; i++)
            if (!seen[i]) res[1] = i;

        return res;
    }
}
