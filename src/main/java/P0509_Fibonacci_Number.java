public class P0509_Fibonacci_Number {
    /**
     * 509. Fibonacci Number <a href=>https://leetcode.com/problems/fibonacci-number/description/</a><p>
     * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
     * <p>
     * F(0) = 0, F(1) = 1<p>
     * F(n) = F(n - 1) + F(n - 2), for n > 1.<p>
     * Given n, calculate F(n).<p>
     * <p>
     * Example 1:<p>
     * Input: n = 2<p>
     * Output: 1<p>
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.<p>
     * <p>
     * Example 2:<p>
     * Input: n = 3<p>
     * Output: 2<p>
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.<p>
     * <p>
     * Example 3:<p>
     * Input: n = 4<p>
     * Output: 3<p>
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.<p>
     */

    public static void main(String[] args) {
        var n = 4;
        int res = new P0509_Fibonacci_Number().fib(n);
        System.out.println(res);
    }

    private int fib(int n) {
        if (n <= 1) return n;

        return fib(n - 2) + fib(n - 1);
    }
}
