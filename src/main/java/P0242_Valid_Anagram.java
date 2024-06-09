public class P0242_Valid_Anagram {
    /**
     * 242. Valid Anagram <a href=>https://leetcode.com/problems/valid-anagram/description/</a><p>
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * <p>
     * Example 1:<p>
     * Input: s = "anagram", t = "nagaram"<p>
     * Output: true<p>
     * <p>
     * Example 2:<p>
     * Input: s = "rat", t = "car"<p>
     * Output: false<p>
     */
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean res = new P0242_Valid_Anagram().isAnagram(s, t);
        System.out.println(res);
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
