package leetcode;

public class P0704_Binary_Search {
    /**
     * 704. Binary Search <a href=>https://leetcode.com/problems/binary-search/description/</a><p>
     * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
     * If target exists, then return its index. Otherwise, return -1.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     * <p>
     * Example 1:<p>
     * Input: nums = [-1,0,3,5,9,12], target = 9<p>
     * Output: 4<p>
     * Explanation: 9 exists in nums and its index is 4<p>
     * <p>
     * Example 2:<p>
     * Input: nums = [-1,0,3,5,9,12], target = 2<p>
     * Output: -1<p>
     * Explanation: 2 does not exist in nums so return -1<p>
     */

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        var target = 9;
        int res = new P0704_Binary_Search().search(nums, target);
        System.out.println(res);
    }

    private int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (target == nums[middle]) {
                return middle;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
