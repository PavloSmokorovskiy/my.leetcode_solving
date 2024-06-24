public class P2519_Count_the_Number_of_K_Big_Indices {
    /*
    2519. Count the Number of K-Big Indices https://leetcode.com/problems/count-the-number-of-k-big-indices/description
You are given a 0-indexed integer array nums and a positive integer k.
We call an index i k-big if the following conditions are satisfied:
There exist at least k different indices idx1 such that idx1 < i and nums[idx1] < nums[i].
There exist at least k different indices idx2 such that idx2 > i and nums[idx2] < nums[i].
Return the number of k-big indices.

Example 1:
Input: nums = [2,3,6,5,2,3], k = 2
Output: 2
Explanation: There are only two 2-big indices in nums:
- i = 2 --> There are two valid idx1: 0 and 1. There are three valid idx2: 2, 3, and 4.
- i = 3 --> There are two valid idx1: 0 and 1. There are two valid idx2: 3 and 4.

Example 2:
Input: nums = [1,1,1], k = 3
Output: 0
Explanation: There are no 3-big indices in nums.
     */

    public static void main(String[] args) {
        var nums1 = new int[]{2, 3, 6, 5, 2, 3};
        var k1 = 2;
        int res = new P2519_Count_the_Number_of_K_Big_Indices().kBigIndices(nums1, k1);
        System.out.println(res);
    }

    int kBigIndices(int[] nums, int k) {

        return 0;
    }


    int kBigIndicesBruteForce(int[] nums, int k) {

        var length = nums.length;
        var result = 0;

        if (k >= length) {
            return result;
        }

        for (int i = k; i < length; i++) {

            var countLessBefore = 0;
            var countLessAfter = 0;

            for (var j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    countLessBefore++;
                }
                if (countLessBefore >= k){
                    break;
                }
            }

            for (var j = i + 1; j < length; j++) {
                if (nums[j] < nums[i]) {
                    countLessAfter++;
                }
                if (countLessAfter >= k){
                    break;
                }
            }

            if (countLessBefore >= k && countLessAfter >= k) {
                result++;
            }
        }

        return result;
    }
}
