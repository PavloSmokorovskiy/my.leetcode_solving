package leetcode;

public class P0459_Repeated_Substring_Pattern {

    /**
     * 459. Repeated Substring Pattern
     * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of
     * the substring together.
     * <p>
     * Example 1:
     * Input: s = "abab"
     * Output: true
     * Explanation: It is the substring "ab" twice.
     * <p>
     * Example 2:
     * Input: s = "aba"
     * Output: false
     * <p>
     * Example 3:
     * Input: s = "abcabcabcabc"
     * Output: true
     * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
     */

    public static void main(String[] args) {
        var s = "abab";
        System.out.println(new P0459_Repeated_Substring_Pattern().repeatedSubstringPattern(s));
    }

    /**
     * - u = s + s
     * - remove the first and the last symbols
     * - if u.contains(s) -> true
     * <p>
     * Explanation
     * Positive:
     * "abсabс" + "abсabс"
     * "[abс][abс]"
     * "[abс][abс],[abс][abс]"
     * "bc][abс][abс][ab"
     * ^^^  ^^^
     * abc][abc -> true
     * <p>
     * "bc][abс][abс][ab"
     * <p>
     * Negative:
     * "[abс][abd]"
     * "[abс][abd],[abс][abd]"
     * "bc][abd][abс][ab"
     * ^^^  ^^^
     * abc][abd -> false
     */

    private boolean repeatedSubstringPattern(String s) {

        String doubled = s + s;
        String middle = doubled.substring(1, doubled.length() - 1);
        return middle.contains(s);
    }
}
