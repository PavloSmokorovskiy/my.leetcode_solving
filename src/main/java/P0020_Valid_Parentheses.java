import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P0020_Valid_Parentheses {

    /*
    20. Valid Parentheses https://leetcode.com/problems/valid-parentheses/description/
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
     */

    public static void main(String[] args) {
//        String s1 = "()[]{}";
//        System.out.println(isValid(s1));
//
//        String s2 = "(]";
//        System.out.println(isValid(s2));

//        String s3 = "{[]}";
//        System.out.println(isValid(s3));

        String s4 = "((";
        System.out.println(isValid(s4));
    }

    /*
1. put bracket into the stack
2. check if provided bracket is closed
2.1 if no put bracket into the stack
2.2 if yes check is it pair to provided bracket remove it
2.3 if it is no pair return false
    */

    static boolean isValid(String s) {
        final var length = s.length();
        if (length <= 1) {
            return false;
        }

        var stack = new char[length];
        var top = -1;

        for (var ch : s.toCharArray()){
            if (ch == '('){
                stack[++top] = ')';
            } else if (ch == '{') {
                stack[++top] = '}';
            } else if (ch == '[') {
                stack[++top] = ']';
            } else {
                if (top == -1 || stack[top--] != ch){
                    return false;
                }
            }
        }

        return top == -1;
    }


    static boolean isValidUnoptimized(String s) {

        final var length = s.length();
        if (length <= 1) {
            return false;
        }

        var stack = new char[length];
        var top = -1;

        for (var i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (isBracketOpened(ch)) {
                stack[++top] = ch;
            } else if (top != -1 && isPair(stack[top], ch)) {
                top--;
            } else {
                return false;
            }
        }

        return top == -1;
    }

    private static boolean isBracketOpened(char ch) {
        char[] validOpenedBrackets = { '(', '{', '[' };
        for (char c : validOpenedBrackets) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPair(char chOpen, char chClose) {
        return (chOpen == '(' && chClose == ')') ||
                (chOpen == '{' && chClose == '}') ||
                (chOpen == '[' && chClose == ']');
    }
}
