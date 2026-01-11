package leetcode;

public class P1354_Construct_Target_Array_With_Multiple_Sums {

    /**
     * You are given an array target of n integers. From a starting array arr consisting of n 1's, you may perform the
     * following procedure :
     * <p>
     * let x be the sum of all elements currently in your array.
     * choose index i, such that 0 <= i < n and set the value of arr at index i to x.
     * You may repeat this procedure as many times as needed.
     * Return true if it is possible to construct the target array from arr, otherwise, return false.
     * <p>
     * Example 1:
     * Input: target = [9,3,5]
     * Output: true
     * Explanation: Start with arr = [1, 1, 1]
     * [1, 1, 1], sum = 3 choose index 1
     * [1, 3, 1], sum = 5 choose index 2
     * [1, 3, 5], sum = 9 choose index 0
     * [9, 3, 5] Done
     * <p>
     * Example 2:
     * Input: target = [1,1,1,2]
     * Output: false
     * Explanation: Impossible to create target array from [1,1,1,1].
     * <p>
     * Example 3:
     * Input: target = [8,5]
     * Output: true
     */

    public static void main(String[] args) {
        var target = new int[]{9, 3, 5};
        System.out.println(new P1354_Construct_Target_Array_With_Multiple_Sums().isPossible(target));
    }

    private boolean isPossible(int[] target) {


        return false;
    }
}
