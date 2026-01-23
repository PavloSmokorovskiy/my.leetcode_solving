package leetcode;

public class P0009_Palindrome_Number {
    /**
     * 9. Palindrome Number
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * <p>
     * Example 1:
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * <p>
     * Example 2:
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * <p>
     * Example 3:
     * Input: x = 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     */
    public static void main(String[] args) {
        var x = 121;
        System.out.println(new P0009_Palindrome_Number().isPalindrome(x));
    }

    private boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
