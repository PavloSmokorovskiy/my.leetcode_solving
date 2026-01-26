package leetcode;

public class P1590_Make_Sum_Divisible_by_P {

    /**
     * 1590. Make Sum Divisible by P
     * Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the
     * remaining elements is divisible by p. It is not allowed to remove the whole array.
     * <p>
     * Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.
     * <p>
     * A subarray is defined as a contiguous block of elements in the array.
     * <p>
     * Example 1:
     * Input: nums = [3,1,4,2], p = 6
     * Output: 1
     * Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4],
     * and the sum of the remaining elements is 6, which is divisible by 6.
     * <p>
     * Example 2:
     * Input: nums = [6,3,5,2], p = 9
     * Output: 2
     * Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray
     * [5,2], leaving us with [6,3] with sum 9.
     * <p>
     * Example 3:
     * Input: nums = [1,2,3], p = 3
     * Output: 0
     * Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.
     */
    public static void main(String[] args) {
        var nums = new int[]{3, 1, 4, 2};
        var p = 6;
        System.out.println(new P1590_Make_Sum_Divisible_by_P().minSubarray(nums, p));
    }

    private int minSubarray(int[] nums, int p) {

        return 0;
    }
}
