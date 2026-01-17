package leetcode;

import java.util.Arrays;

public class P1672_Richest_Customer_Wealth {

    /**
     * You are given an m x n integer grid accounts where accounts[i][j]
     * is the amount of money the i2th customer has in the j2th bank.
     * Return the wealth that the richest customer has.
     * <p>
     * A customer's wealth is the amount of money they have in all their bank accounts.
     * The richest customer is the customer that has the maximum wealth.
     * <p>
     * Example 1:
     * Input: accounts = [[1,2,3],[3,2,1]]
     * Output: 6
     * Explanation:
     * 1st customer has wealth = 1 + 2 + 3 = 6
     * 2nd customer has wealth = 3 + 2 + 1 = 6
     * Both customers are considered the richest with a wealth of 6 each, so return 6.
     * <p>
     * Example 2:
     * Input: accounts = [[1,5],[7,3],[3,5]]
     * Output: 10
     * Explanation:
     * 1st customer has wealth = 6
     * 2nd customer has wealth = 10
     * 3rd customer has wealth = 8
     * The 2nd customer is the richest with a wealth of 10.
     * <p>
     * Example 3:
     * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
     * Output: 17
     */

    public static void main(String[] args) {
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int res = new P1672_Richest_Customer_Wealth().maximumWealth2(accounts2);
        System.out.println(res);
    }

    private int maximumWealth1(int[][] accounts) {
        var res1 = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                res1[i] = res1[i] + accounts[i][j];
            }

        }
        System.out.println(Arrays.toString(res1));
        var res2 = 0;
        for (int i = 0; i < res1.length; i++) {
            if (res2 < res1[i]) res2 = res1[i];
        }

        return res2;
    }

    private int maximumWealth2(int[][] accounts) {
        var res = 0;
        for (int[] acc : accounts) {
            var temp = 0;
            for (int i : acc) {
                temp += i;
            }
            res = Math.max(res, temp);
        }
        return res;
    }
}