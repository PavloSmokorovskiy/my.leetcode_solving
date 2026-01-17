package leetcode;

public class P0560_Subarray_Sum_Equals_K {

    /**
     * 560. Subarray Sum Equals K
     * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * <p>
     * Example 1:
     * Input: nums = [1,1,1], k = 2
     * Output: 2
     * <p>
     * Example 2:
     * Input: nums = [1,2,3], k = 3
     * Output: 2
     */

    public static void main(String[] args) {
        var nums = new int[]{1, 1, 1};
        var k = 2;
        System.out.println(new P0560_Subarray_Sum_Equals_K().subarraySum(nums, k));
    }

    private int subarraySum(int[] nums, int k) {

        return 0;
    }
}
