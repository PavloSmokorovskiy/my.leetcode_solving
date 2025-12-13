package leetcode;

public class P0876_Middle_of_the_Linked_List {

    /**
     * Given the head of a singly linked list,
     * return the middle node of the linked list.
     * <p>
     * If there are two middle nodes, return the second middle node.
     * <p>
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3.
     * <p>
     * Example 2:
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
     */

    public static void main(String[] args) {
        var head = new ListNode(
                1, new ListNode(
                        2, new ListNode(
                                3, new ListNode(
                                        4, new ListNode(
                                                5, new ListNode())))));
        System.out.println(new P0876_Middle_of_the_Linked_List().middleNode(head));
    }

    ListNode middleNode(ListNode head) {
        return null;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


