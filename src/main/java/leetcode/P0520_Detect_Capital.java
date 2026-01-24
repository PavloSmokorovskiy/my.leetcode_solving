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

    /**
     * 1. length == 1 -> true
     * <p>
     * Success cases:
     * a) USA
     * b) small
     * c) Giraffe
     * <p>
     * 2. See first and second letters.
     * - If both Capital -> a -> GOTO 3
     * - If both small -> b -> GOTO 4
     * - If first is Capital second is small -> c
     * - If first is small second is Capital -> false
     * <p>
     * 3. Capital solution: count all Capital == word.length
     * 4. Small solution: count all small == word.length
     * 5. Giraff solution: count rest == word.length - 1
     * <p>
     * 6. Regular expression [A-Z][a-z] - overenineering
     */

    private boolean detectCapitalUse(String word) {

        int n = word.length();
        if (n == 1)
            return true;

        boolean firstUpper = Character.isUpperCase(word.charAt(0));
        boolean secondUpper = Character.isUpperCase(word.charAt(1));

        //if the first small
        if (!firstUpper) {
            // rest small
            for (int i = 1; i < n; i++)
                if (Character.isUpperCase(word.charAt(i)))
                    return false;
            return true;
        }

        //if the first upper:
        if (secondUpper) {
            // rest upper
            for (int i = 1; i < n; i++)
                if (!Character.isUpperCase(word.charAt(i)))
                    return false;
            return true;
        } else {
            // rest small
            for (int i = 1; i < n; i++)
                if (Character.isUpperCase(word.charAt(i)))
                    return false;
            return true;
        }
    }
}
