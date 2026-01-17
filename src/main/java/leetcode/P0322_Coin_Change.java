package leetcode;

import java.util.Arrays;

public class P0322_Coin_Change {

    /**
     * ou are given an integer array coins representing coins of different denominations and an integer
     * amount representing a total amount of money.
     * <p>
     * Return the fewest number of coins that you need to make up that amount. If that amount of money
     * cannot be made up by any combination of the coins, return -1.
     * <p>
     * You may assume that you have an infinite number of each kind of coin.
     * <p>
     * Example 1:
     * Input: coins = [1,2,5], amount = 11
     * Output: 3
     * Explanation: 11 = 5 + 5 + 1
     * <p>
     * Example 2:
     * Input: coins = [2], amount = 3
     * Output: -1
     * <p>
     * Example 3:
     * Input: coins = [1], amount = 0
     * Output: 0
     */

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        var amount = 11;
        System.out.println(new P0322_Coin_Change().coinChange1(coins, amount));
    }

    private int coinChange1(int[] coins, int amount) {
        if (amount == 0) return 0;

        int INF = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int x = 1; x <= amount; x++) {
            for (int c : coins) {
                if (x - c >= 0) {
                    dp[x] = Math.min(dp[x], dp[x - c] + 1);
                }
            }
        }

        return dp[amount] == INF ? -1 : dp[amount];
    }
}
