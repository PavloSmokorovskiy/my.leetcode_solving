package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class P0150_Evaluate_Reverse_Polish_Notation {

    /**
     * You are given an array of strings tokens that represents an arithmetic expression
     * in a Reverse Polish Notation.
     * <p>
     * Evaluate the expression. Return an integer that represents the value of the expression.
     * <p>
     * Note that:
     * <p>
     * The valid operators are '+', '-', '*', and '/'.
     * Each operand may be an integer or another expression.
     * The division between two integers always truncates toward zero.
     * There will not be any division by zero.
     * The input represents a valid arithmetic expression in a reverse polish notation.
     * The answer and all the intermediate calculations can be represented in a 32-bit integer.
     * <p>
     * <p>
     * Example 1:
     * Input: tokens = ["2","1","+","3","*"]
     * Output: 9
     * Explanation: ((2 + 1) * 3) = 9
     * <p>
     * Example 2:
     * Input: tokens = ["4","13","5","/","+"]
     * Output: 6
     * Explanation: (4 + (13 / 5)) = 6
     * <p>
     * Example 3:
     * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
     * Output: 22
     * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
     * = ((10 * (6 / (12 * -11))) + 17) + 5
     * = ((10 * (6 / -132)) + 17) + 5
     * = ((10 * 0) + 17) + 5
     * = (0 + 17) + 5
     * = 17 + 5
     * = 22
     */

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4","13","5","/","+"};
        System.out.println(new P0150_Evaluate_Reverse_Polish_Notation().evalRPN(tokens2));
    }

    int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : tokens) {
                switch (s) {
                    case "+" -> { int a = stack.pop(); int b = stack.pop(); stack.push(b + a);}
                    case "-" -> { int a = stack.pop(); int b = stack.pop(); stack.push(b - a);}
                    case "*" -> { int a = stack.pop(); int b = stack.pop(); stack.push(b * a);}
                    case "/" -> { int a = stack.pop(); int b = stack.pop(); stack.push(b / a);}
                    default -> stack.push(Integer.parseInt(s));
                }
            }

        return stack.pop();
    }
}
