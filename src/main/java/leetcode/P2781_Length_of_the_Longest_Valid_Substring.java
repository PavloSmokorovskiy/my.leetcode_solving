package leetcode;

import java.util.*;

public class P2781_Length_of_the_Longest_Valid_Substring {
    /*
    2781. Length of the Longest Valid Substring https://leetcode.com/problems/length-of-the-longest-valid-substring/description/
You are given a string word and an array of strings forbidden.
A string is called valid if none of its substrings are present in forbidden.
Return the length of the longest valid substring of the string word.
A substring is a contiguous sequence of characters in a string, possibly empty.

Example 1:
Input: word = "cbaaaabc", forbidden = ["aaa","cb"]
Output: 4
Explanation: There are 11 valid substrings in word: "c", "b", "a", "ba", "aa", "bc", "baa", "aab", "ab", "abc" and "aabc". The length of the longest valid substring is 4.
It can be shown that all other substrings contain either "aaa" or "cb" as a substring.

Example 2:
Input: word = "leetcode", forbidden = ["de","le","e"]
Output: 4
Explanation: There are 11 valid substrings in word: "l", "t", "c", "o", "d", "tc", "co", "od", "tco", "cod", and "tcod". The length of the longest valid substring is 4.
It can be shown that all other substrings contain either "de", "le", or "e" as a substring.
     */
    public static void main(String[] args) {
        String word1 = "cbaaaabc";
        List<String> forbidden1 = List.of("aaa", "cb");
        int res = new P2781_Length_of_the_Longest_Valid_Substring().longestValidSubstring(word1, forbidden1);
        System.out.println(res);
    }

    int longestValidSubstring(String word, List<String> forbidden) {

        int maxLength = 0;
        outer:
        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                String substring = word.substring(start, end);
                for (String forb : forbidden) {
                    if (substring.contains(forb)) {
                        continue outer;
                    }
                }
                maxLength = Math.max(maxLength, substring.length());
            }
        }
        return maxLength;
    }

}
