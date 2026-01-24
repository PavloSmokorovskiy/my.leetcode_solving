package leetcode;

public class P0686_Repeated_String_Match {

    /**
     * 686. Repeated String Match
     * <p>
     * Given two strings a and b, return the minimum number of times you should repeat string a so that string b is
     * a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it,
     * return -1.
     * <p>
     * Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".
     * <p>
     * Example 1:
     * Input: a = "abcd", b = "cdabcdab"
     * Output: 3
     * Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
     * <p>
     * Example 2:
     * Input: a = "a", b = "aa"
     * Output: 2
     */

    public static void main(String[] args) {
        String a = "abcd", b = "cdabcdab";
        System.out.println(new P0686_Repeated_String_Match().repeatedStringMatch(a, b));
    }

    private int repeatedStringMatch(String a, String b) {

        return 0;
    }
}
