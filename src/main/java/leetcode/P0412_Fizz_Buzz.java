package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0412_Fizz_Buzz {

    /**
     * Given an integer n, return a string array answer (1-indexed) where:
     * <p>
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: n = 3
     * Output: ["1","2","Fizz"]
     * Example 2:
     * <p>
     * Input: n = 5
     * Output: ["1","2","Fizz","4","Buzz"]
     * Example 3:
     * <p>
     * Input: n = 15
     * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     */

    public static void main(String[] args) {
        var input = 3;
        System.out.println(new P0412_Fizz_Buzz().fizzBuzz1(input));
    }

    List<String> fizzBuzz1(int n) {

        var answer = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;

            if (fizz && buzz) answer.add("FizzBuzz");
            else if (fizz) answer.add("Fizz");
            else if (buzz) answer.add("Buzz");
            else answer.add(String.valueOf(i));
        }

        return answer;
    }
}
