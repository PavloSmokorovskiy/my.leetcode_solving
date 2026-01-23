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
        System.out.println(new P0014_Longest_Common_Prefix().longestCommonPrefixHorisontalScan(strs));
    }

    private String longestCommonPrefixHorisontalScan(String[] strs) {

        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        String prefix = strs[0];

        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    private String longestCommonPrefixVerticalScan(String[] strs) {

        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            char ch0 = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++)
                if (i >= strs[j].length() || ch0 != strs[j].charAt(i))
                    return strs[0].substring(0, i);
        }
        return strs[0];
    }
}
