package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1492_The_kth_Factor_of_n {

    /**
     * You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
     * Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1
     * if n has less than k factors.
     * <p>
     * Example 1:
     * Input: n = 12, k = 3
     * Output: 3
     * Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
     * <p>
     * Example 2:
     * Input: n = 7, k = 2
     * Output: 7
     * Explanation: Factors list is [1, 7], the 2nd factor is 7.
     * <p>
     * Example 3:
     * Input: n = 4, k = 4
     * Output: -1
     * Explanation: Factors list is [1, 2, 4], there is only 3 factors. We should return -1.
     */

    public static void main(String[] args) {
        int n1 = 12, k1 = 3;
        int res1 = new P1492_The_kth_Factor_of_n().kthFactor(n1, k1);
        System.out.println(res1);

        int n2 = 4, k2 = 4;
        int res2 = new P1492_The_kth_Factor_of_n().kthFactor(n2, k2);
        System.out.println(res2);
    }

    private int kthFactor(int n, int k) {

        List<Integer> factorsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorsList.add(i);
            }
        }

        if (factorsList.size() < k) {
            return -1;
        } else {
            return factorsList.get(k);
        }
    }
}
