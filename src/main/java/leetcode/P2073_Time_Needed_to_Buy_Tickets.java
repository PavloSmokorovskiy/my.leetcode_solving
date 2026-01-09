package leetcode;

public class P2073_Time_Needed_to_Buy_Tickets {

    /**
     * There are n people in a line queuing to buy tickets, where the 0th person is
     * at the front of the line and the (n - 1)th person is at the back of the line.
     * <p>
     * You are given a 0-indexed integer array tickets of length n where the number
     * of tickets that the ith person would like to buy is tickets[i].
     * <p>
     * Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket
     * at a time and has to go back to the end of the line (which happens instantaneously)
     * in order to buy more tickets. If a person does not have any tickets left to buy,
     * the person will leave the line.
     * <p>
     * Return the time taken for the person initially at position k (0-indexed) to finish
     * buying tickets.
     * <p>
     * Example 1:
     * Input: tickets = [2,3,2], k = 2
     * Output: 6
     * Explanation:
     * The queue starts as [2,3,2], where the kth person is underlined.
     * After the person at the front has bought a ticket, the queue becomes [3,2,1] at 1 second.
     * Continuing this process, the queue becomes [2,1,2] at 2 seconds.
     * Continuing this process, the queue becomes [1,2,1] at 3 seconds.
     * Continuing this process, the queue becomes [2,1] at 4 seconds. Note: the person at the front left the queue.
     * Continuing this process, the queue becomes [1,1] at 5 seconds.
     * Continuing this process, the queue becomes [1] at 6 seconds. The kth person has bought all their tickets, so return 6.
     * <p>
     * Example 2:
     * Input: tickets = [5,1,1,1], k = 0
     * Output: 8
     * Explanation:
     * The queue starts as [5,1,1,1], where the kth person is underlined.
     * After the person at the front has bought a ticket, the queue becomes [1,1,1,4] at 1 second.
     * Continuing this process for 3 seconds, the queue becomes [4] at 4 seconds.
     * Continuing this process for 4 seconds, the queue becomes [] at 8 seconds. The kth person has bought all their tickets, so return 8.
     */

    public static void main(String[] args) {
        var tickets = new int[]{2, 3, 2};
        var k = 2;

        System.out.println(new P2073_Time_Needed_to_Buy_Tickets().timeRequiredToBuy(tickets, k));
    }

    private int timeRequiredToBuy(int[] tickets, int k) {

        return 0;
    }
}
