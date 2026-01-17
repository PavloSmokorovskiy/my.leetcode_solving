package leetcode;

public class P0202_Happy_Number {

    /**
     * Write an algorithm to determine if a number n is happy.
     * <p>
     * A happy number is a number defined by the following process:
     * <p>
     * Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
     * <p>
     * Example 1:
     * Input: n = 19
     * Output: true
     * Explanation:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     * <p>
     * Example 2:
     * Input: n = 2
     * Output: false
     */

    public static void main(String[] args) {
        var n = 19;
        System.out.println(new P0202_Happy_Number().isHappy(n));
    }

    private boolean isHappy(int n) {

        return false;
    }
}
