package leetcode;

import java.util.*;

public class P2405_Optimal_Partition_of_String {

    /**
     * 2405. Optimal Partition of String
     * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique.
     * That is, no letter appears in a single substring more than once.
     * Return the minimum number of substrings in such a partition.
     * Note that each character should belong to exactly one substring in a partition.
     * <p>
     * Example 1:
     * Input: s = "abacaba"
     * Output: 4
     * Explanation:
     * Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
     * It can be shown that 4 is the minimum number of substrings needed.
     * <p>
     * Example 2:
     * Input: s = "ssssss"
     * Output: 6
     * Explanation:
     * The only valid partition is ("s","s","s","s","s","s").
     */

    public static void main(String[] args) {
        String s = "abacaba";
        int res = new P2405_Optimal_Partition_of_String().partitionString(s);
        System.out.println(res);

    }

    private int partitionString(String s) {

        var res = 0;
        Set<Character> characters = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (characters.contains(ch)) {
                res++;
                characters.clear();
            }
            characters.add(ch);
        }
        if (!characters.isEmpty()) {
            res++;
        }
        return res;
    }
}
