package leetcode;

public class P0007_Reverse_Integer {
    /**
     * 7. Reverse Integer <a href=>https://leetcode.com/problems/reverse-integer/description/</a><p>
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     * <p>
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     * <p>
     * Example 1:</p>
     * Input: x = 123<p>
     * Output: 321</p>
     * <p>
     * Example 2:</p>
     * Input: x = -123<p>
     * Output: -321</p>
     * <p>
     * Example 3:</p>
     * Input: x = 120<p>
     * Output: 21</p>
     */
    public static void main(String[] args) {
        int input = -463847412;
        System.out.println(input);
        int res = new P0007_Reverse_Integer().reverse(input);
        System.out.println(res);
    }

    private int reverse(int x) {

        var res = 0L;
        var digit = 0;
        while (x != 0) {
            digit = x % 10;
            res = res * 10 + digit;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        }

        return (int) res;
    }
}
