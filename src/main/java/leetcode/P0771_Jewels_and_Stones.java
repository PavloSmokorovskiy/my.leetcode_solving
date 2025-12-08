package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0771_Jewels_and_Stones {

    /*
    771. Jewels and Stones https://leetcode.com/problems/jewels-and-stones/description/

You're given strings jewels representing the types of stones that are jewels,
and stones representing the stones you have. Each character in stones is a type
of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
     */

    public static void main(String[] args) {

        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = new Solution().numJewelsInStones(jewels, stones);
        System.out.println(res);
    }

    static class Solution {
        public int numJewelsInStones(String jewels, String stones) {

            Set<Character> jewelsSet = new HashSet<>();
            for (Character ch : jewels.toCharArray()) {
                jewelsSet.add(ch);
            }

            var res = 0;
            for (Character ch : stones.toCharArray()) {
                if (jewelsSet.contains(ch)) {
                    res++;
                }
            }

            return res;
        }
    }
}

