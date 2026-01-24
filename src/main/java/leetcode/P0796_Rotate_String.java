package leetcode;

public class P0796_Rotate_String {

    /**
     * 796. Rotate String
     * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
     * <p>
     * A shift on s consists of moving the leftmost character of s to the rightmost position.
     * <p>
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     * <p>
     * Example 1:
     * Input: s = "abcde", goal = "cdeab"
     * Output: true
     * <p>
     * Example 2:
     * Input: s = "abcde", goal = "abced"
     * Output: false
     */

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        System.out.println(new P0796_Rotate_String().rotateString(s, goal));
    }

    private boolean rotateString(String s, String goal) {

        return false;
    }
}
