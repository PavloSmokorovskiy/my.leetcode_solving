package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0383_Ransom_Note {

    /**
     * Given two strings ransomNote and magazine,
     * return true if ransomNote can be constructed by using the letters from magazine
     * and false otherwise.
     * <p>
     * Each letter in magazine can only be used once in ransomNote.
     * <p>
     * Example 1:
     * Input: ransomNote = "a", magazine = "b"
     * Output: false
     * <p>
     * Example 2:
     * Input: ransomNote = "aa", magazine = "ab"
     * Output: false
     * <p>
     * Example 3:
     * Input: ransomNote = "aa", magazine = "aab"
     * Output: true
     */

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(new P0383_Ransom_Note().canConstruct1(ransomNote, magazine));
    }

    private boolean canConstruct1(String ransomNote, String magazine) {
        Map<Character, Integer> alphabet = new HashMap<>(26);
        for (Character c : magazine.toCharArray()) alphabet.put(c, alphabet.getOrDefault(c, 0) + 1);
        for (Character c : ransomNote.toCharArray()) {
            int v = alphabet.getOrDefault(c, 0);
            if (v == 0) return false;
            alphabet.put(c, --v);
        }
        return true;
    }

    private boolean canConstruct2(String ransomNote, String magazine) {
        int[] alphabet = new int[26];
        int index;
        for (char c : ransomNote.toCharArray()) {
            index = magazine.indexOf(c, alphabet[c - 'a']);
            if (index == -1) return false;
            alphabet[c - 'a']++;
        }
        return true;
    }

    private boolean canConstruct3(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a']-- < 0) return false;
        }

        return true;
    }

    private boolean canConstruct4(String ransomNote, String magazine) {

        char[] magArr = magazine.toCharArray();

        for (char c : ransomNote.toCharArray()) {
            boolean found = false;
            for (int j = 0; j < magArr.length; j++) {
                if (c == magArr[j]) {
                    magArr[j] = 0;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }

        return true;
    }

    private boolean canConstruct5(String ransomNote, String magazine) {

        Integer[] magArr = new Integer[magazine.length()];
        for (int i = 0; i < magazine.length(); i++) {
            int cp = magazine.codePointAt(i);
            magArr[i] = cp;
        }

        Integer[] ranArr = new Integer[ransomNote.length()];
        for (int i = 0; i < ransomNote.length(); i++) {
            int cp = ransomNote.codePointAt(i);
            ranArr[i] = cp;
        }

        for (int i = 0; i < ranArr.length; i++) {
            for (int j = 0; j < magArr.length; j++) {
                if (ranArr[i] == magArr[j]) {
                    ranArr[i] = 0;
                    magArr[j] = 0;
                }
            }
        }

        for (int i : ranArr) {
            if (i != 0) return false;
        }

        return true;
    }
}
