package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2422_Merge_Operations_to_Turn_Array_Into_a_Palindrome {

    /**
     * 2422. Merge Operations to Turn Array Into a Palindrome
     * You are given an array nums consisting of positive integers.
     * You can perform the following operation on the array any number of times:
     * Choose any two adjacent elements and replace them with their sum.
     * For example, if nums = [1,2,3,1], you can apply one operation to make it [1,5,1].
     * Return the minimum number of operations needed to turn the array into a palindrome.
     * <p>
     * Example 1:
     * Input: nums = [4,3,2,1,2,3,1]
     * Output: 2
     * Explanation: We can turn the array into a palindrome in 2 operations as follows:
     * - Apply the operation on the fourth and fifth element of the array, nums becomes equal to [4,3,2,3,3,1].
     * - Apply the operation on the fifth and sixth element of the array, nums becomes equal to [4,3,2,3,4].
     * The array [4,3,2,3,4] is a palindrome.
     * It can be shown that 2 is the minimum number of operations needed.
     * <p>
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: 3
     * Explanation: We do the operation 3 times in any position, we obtain the array [10] at the end which is a palindrome.
     */

    public static void main(String[] args) {
//        int[] nums1 = {4, 3, 2, 1, 2, 3, 1};
//        int res1 = new leetcode.P2422_Merge_Operations_to_Turn_Array_Into_a_Palindrome().minimumOperations(nums1);
//        System.out.println(res1);

        int[] nums2 = {1, 2, 3, 4};
        int res2 = new P2422_Merge_Operations_to_Turn_Array_Into_a_Palindrome().minimumOperationsPointers(nums2);
        System.out.println(res2);
    }

    private int minimumOperationsLRSum(int[] nums) {
        int counter = 0, left = 0, right = nums.length - 1, leftSum = nums[0], rightSum = nums[nums.length - 1];

        while (left < right) {
            if (leftSum == rightSum) {
                left++;
                right--;
                leftSum = nums[left];
                rightSum = nums[right];
            } else if (leftSum < rightSum) {
                left++;
                leftSum += nums[left];
                counter++;
            } else {
                right--;
                rightSum += nums[right];
                counter++;
            }
        }
        return counter;
    }

    private int minimumOperationsPointers(int[] nums) {

        int counter = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (nums[left] != nums[right]) {
                if (nums[left] < nums[right]) {
                    nums[left + 1] += nums[left];
                    left++;
                } else {
                    nums[right - 1] += nums[right];
                    right--;
                }
                counter++;
            }
            left++;
            right--;
        }
        return counter;
    }

    private int minimumOperationsBruteForce(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (var i : nums) {
            list.add(i);
        }
        var counter = 0;

        for (int i = 0; i < list.size() / 2; i++) {

            while (list.get(i) != list.get(list.size() - 1 - i)) {
                if (list.get(i) < list.get(list.size() - 1 - i)) {
                    list.set(i, list.get(i) + list.get(i + 1));
                    list.remove(i + 1);
                    counter++;
                } else if (list.get(i) > list.get(list.size() - 1 - i)) {
                    list.set((list.size() - 1 - i - 1), list.get(list.size() - 1 - i) + list.get(list.size() - 1 - i - 1));
                    list.remove(list.size() - 1 - i);
                    counter++;
                }
            }

        }
        return counter;
    }
}
