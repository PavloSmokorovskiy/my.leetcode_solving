package leetcode;

public class P0831_Masking_Personal_Information {

    /**
     * 831. Masking Personal Information
     * You are given a personal information string s, representing either an email address or a phone number. Return the masked personal information using the below rules.
     * <p>
     * Email address:
     * <p>
     * An email address is:
     * <p>
     * A name consisting of uppercase and lowercase English letters, followed by
     * The '@' symbol, followed by
     * The domain consisting of uppercase and lowercase English letters with a dot '.' somewhere in the middle (not the first or last character).
     * To mask an email:
     * <p>
     * The uppercase letters in the name and domain must be converted to lowercase letters.
     * The middle letters of the name (i.e., all but the first and last letters) must be replaced by 5 asterisks "*****".
     * Phone number:
     * <p>
     * A phone number is formatted as follows:
     * <p>
     * The phone number contains 10-13 digits.
     * The last 10 digits make up the local number.
     * The remaining 0-3 digits, in the beginning, make up the country code.
     * Separation characters from the set {'+', '-', '(', ')', ' '} separate the above digits in some way.
     * To mask a phone number:
     * <p>
     * Remove all separation characters.
     * The masked phone number should have the form:
     * "***-***-XXXX" if the country code has 0 digits.
     * "+*-***-***-XXXX" if the country code has 1 digit.
     * "+**-***-***-XXXX" if the country code has 2 digits.
     * "+***-***-***-XXXX" if the country code has 3 digits.
     * "XXXX" is the last 4 digits of the local number.
     * <p>
     * Example 1:
     * Input: s = "LeetCode@LeetCode.com"
     * Output: "l*****e@leetcode.com"
     * Explanation: s is an email address.
     * The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
     * <p>
     * Example 2:
     * Input: s = "AB@qq.com"
     * Output: "a*****b@qq.com"
     * Explanation: s is an email address.
     * The name and domain are converted to lowercase, and the middle of the name is replaced by 5 asterisks.
     * Note that even though "ab" is 2 characters, it still must have 5 asterisks in the middle.
     * <p>
     * Example 3:
     * Input: s = "1(234)567-890"
     * Output: "***-***-7890"
     * Explanation: s is a phone number.
     * There are 10 digits, so the local number is 10 digits and the country code is 0 digits.
     * Thus, the resulting masked number is "***-***-7890".
     */

    public static void main(String[] args) {
        var s = "LeetCode@LeetCode.com";
        System.out.println(new P0831_Masking_Personal_Information().maskPII(s));
    }

    private String maskPII(String s) {

        return null;
    }
}
