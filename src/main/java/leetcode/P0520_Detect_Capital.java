package leetcode;

public class P0520_Detect_Capital {

    /**
     * 520. Detect Capital
     * We define the usage of capitals in a word to be right when one of the following cases holds:
     * <p>
     * All letters in this word are capitals, like "USA".
     * All letters in this word are not capitals, like "leetcode".
     * Only the first letter in this word is capital, like "Google".
     * Given a string word, return true if the usage of capitals in it is right.
     * <p>
     * Example 1:
     * Input: word = "USA"
     * Output: true
     * <p>
     * Example 2:
     * Input: word = "FlaG"
     * Output: false
     */

    public static void main(String[] args) {
        var word = "USA";
        System.out.println(new P0520_Detect_Capital().detectCapitalUse(word));
    }

    private boolean detectCapitalUse(String word) {

        return false;
    }
}
