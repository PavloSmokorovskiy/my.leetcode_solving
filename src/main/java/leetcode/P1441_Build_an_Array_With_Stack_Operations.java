package leetcode;

import java.util.*;

public class P1441_Build_an_Array_With_Stack_Operations {

    /**
     * You are given an integer array target and an integer n.
     * <p>
     * You have an empty stack with the two following operations:
     * <p>
     * "Push": pushes an integer to the top of the stack.
     * "Pop": removes the integer on the top of the stack.
     * You also have a stream of the integers in the range [1, n].
     * <p>
     * Use the two stack operations to make the numbers in the stack
     * (from the bottom to the top) equal to target. You should follow the
     * following rules:
     * <p>
     * If the stream of the integers is not empty, pick the next integer from
     * the stream and push it to the top of the stack.
     * If the stack is not empty, pop the integer at the top of the stack.
     * If, at any moment, the elements in the stack (from the bottom to the top)
     * are equal to target, do not read new integers from the stream and do not do more
     * operations on the stack.
     * Return the stack operations needed to build target following the mentioned rules.
     * If there are multiple valid answers, return any of them.
     * <p>
     * Example 1:
     * Input: target = [1,3], n = 3
     * Output: ["Push","Push","Pop","Push"]
     * Explanation: Initially the stack s is empty. The last element is the top of the stack.
     * Read 1 from the stream and push it to the stack. s = [1].
     * Read 2 from the stream and push it to the stack. s = [1,2].
     * Pop the integer on the top of the stack. s = [1].
     * Read 3 from the stream and push it to the stack. s = [1,3].
     * <p>
     * Example 2:
     * Input: target = [1,2,3], n = 3
     * Output: ["Push","Push","Push"]
     * Explanation: Initially the stack s is empty. The last element is the top of the stack.
     * Read 1 from the stream and push it to the stack. s = [1].
     * Read 2 from the stream and push it to the stack. s = [1,2].
     * Read 3 from the stream and push it to the stack. s = [1,2,3].
     * <p>
     * Example 3:
     * Input: target = [1,2], n = 4
     * Output: ["Push","Push"]
     * Explanation: Initially the stack s is empty. The last element is the top of the stack.
     * Read 1 from the stream and push it to the stack. s = [1].
     * Read 2 from the stream and push it to the stack. s = [1,2].
     * Since the stack (from the bottom to the top) is equal to target, we stop the stack operations.
     * The answers that read integer 3 from the stream are not accepted.
     */

    public static void main(String[] args) {
        int[] target = {1, 3};
        var n = 3;

        System.out.println(new P1441_Build_an_Array_With_Stack_Operations().buildArray(target, n));
    }

    private List<String> buildArray(int[] target, int n) {

        var res = new LinkedList<String>();
        var stack = new LinkedList<Integer>();
        var index = 0;

        for (int i = 1; i <= n && index < target.length; i++) {
            stack.add(i);
            res.add("Push");
            if (target[index] == i) index++;
            else res.add("Pop");
        }
        return res;
    }
}
