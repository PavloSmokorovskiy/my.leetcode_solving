package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class P0232_Implement_Queue_using_Stacks {

    /**
     * Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support
     * all the functions of a normal queue (push, peek, pop, and empty).
     * <p>
     * Implement the MyQueue class:
     * <p>
     * void push(int x) Pushes element x to the back of the queue.
     * int pop() Removes the element from the front of the queue and returns it.
     * int peek() Returns the element at the front of the queue.
     * boolean empty() Returns true if the queue is empty, false otherwise.
     * Notes:
     * <p>
     * You must use only standard operations of a stack, which means only push to top, peek/pop from top, size,
     * and is empty operations are valid.
     * Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque
     * (double-ended queue) as long as you use only a stack's standard operations.
     * <p>
     * Example 1:
     * Input
     * ["MyQueue", "push", "push", "peek", "pop", "empty"]
     * [[], [1], [2], [], [], []]
     * Output
     * [null, null, null, 1, 1, false]
     * Explanation
     * MyQueue myQueue = new MyQueue();
     * myQueue.push(1); // queue is: [1]
     * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
     * myQueue.peek(); // return 1
     * myQueue.pop(); // return 1, queue is [2]
     * myQueue.empty(); // return false
     */

    public static void main(String[] args) {
        var actions = new String[]{"MyQueue", "push", "push", "peek", "pop", "empty"};
        var elements = new int[][]{{}, {1}, {2}, {}, {}, {}};
        var queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
    }

    private static class MyQueue {

        Deque<Integer> in = new ArrayDeque<>();
        Deque<Integer> out = new ArrayDeque<>();

        public MyQueue() {
        }

        private void moveInToOut() {
            if (!out.isEmpty()) return;
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        public void push(int x) {
            in.push(x);
        }

        public int pop() {
            moveInToOut();
            return out.pop();
        }

        public int peek() {
            moveInToOut();
            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }
    }
}
