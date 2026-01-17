package leetcode;

import java.util.*;
import java.util.stream.Stream;

public class P0937_Reorder_Data_in_Log_Files {

    /**
     * 937. Reorder Data in Log Files
     * You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.
     * <p>
     * There are two types of logs:
     * Letter-logs: All words (except the identifier) consist of lowercase English letters.
     * Digit-logs: All words (except the identifier) consist of digits.
     * Reorder these logs so that:
     * <p>
     * The letter-logs come before all digit-logs.
     * The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
     * The digit-logs maintain their relative ordering.
     * Return the final order of the logs.
     * <p>
     * Example 1:
     * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
     * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
     * Explanation:
     * The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
     * The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".
     * <p>
     * Example 2:
     * Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
     * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
     */
    public static void main(String[] args) {

        String[] logs1 = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] res1 = new Solution().reorderLogFiles(logs1);
        System.out.println(Arrays.toString(res1));

        String[] logs2 = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
        String[] res2 = new Solution().reorderLogFiles(logs2);
        System.out.println(Arrays.toString(res2));

        String[] logs3 = {"zoey i love you", "lucas i love you", "rong i love you"};
        String[] res3 = new Solution().reorderLogFiles(logs3);
        System.out.println(Arrays.toString(res3));

    }

    private static class Solution {
        public String[] reorderLogFiles(String[] logs) {

            Map<String, TreeSet<String>> letterLogs = new TreeMap<>();
            Queue<String> digitLogs = new LinkedList<>();

            for (String log : logs) {
                int indexStr = log.indexOf(' ');
                String firstPart = log.substring(0, indexStr);
                String secondPart = log.substring(indexStr + 1);

                char firstChar = secondPart.charAt(0);
                if (Character.isLetter(firstChar)) {
                    if (!letterLogs.containsKey(secondPart)) {
                        letterLogs.put(secondPart, new TreeSet<>());
                    }
                    letterLogs.get(secondPart).add(firstPart);
                } else {
                    digitLogs.add(log);
                }
            }

            Stream<String> letterLogsStream = letterLogs.entrySet().stream().flatMap(entry -> entry.getValue().stream().map(value -> value + " " + entry.getKey()));
            Stream<String> digitLogsStream = digitLogs.stream();
            return Stream.concat(letterLogsStream, digitLogsStream).toArray(String[]::new);
        }
    }
}
