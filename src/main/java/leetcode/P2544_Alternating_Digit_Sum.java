package leetcode;

public class P2544_Alternating_Digit_Sum {

    /**
     * 2544. Alternating Digit Sum
     * You are given a positive integer n. Each digit of n has a sign according to the following rules:
     * <p>
     * The most significant digit is assigned a positive sign.
     * Each other digit has an opposite sign to its adjacent digits.
     * Return the sum of all digits with their corresponding sign.
     * <p>
     * Example 1:
     * Input: n = 521
     * Output: 4
     * Explanation: (+5) + (-2) + (+1) = 4.
     * <p>
     * Example 2:
     * Input: n = 111
     * Output: 1
     * Explanation: (+1) + (-1) + (+1) = 1.
     * <p>
     * Example 3:
     * Input: n = 886996
     * Output: 0
     * Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
     */

    public static void main(String[] args) {
        var n = 521;
        System.out.println(new P2544_Alternating_Digit_Sum().alternateDigitSum(n));
    }

    private int alternateDigitSum(int n) {


        return 0;
    }
}
