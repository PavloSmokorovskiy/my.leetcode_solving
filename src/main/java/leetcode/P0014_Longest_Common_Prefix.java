package leetcode;

public class P0014_Longest_Common_Prefix {

    /**
     * 14. Longest Common Prefix
     * <p>
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * Example 1:
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * <p>
     * Example 2:
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */

    public static void main(String[] args) {
        var strs = new String[]{"flower", "flow", "flight"};
        System.out.println(new P0014_Longest_Common_Prefix().longestCommonPrefix(strs));
    }

    private String longestCommonPrefix(String[] strs) {

        return "";
    }
}
