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
                4, new ListNode(5)))));
        System.out.println(new P0876_Middle_of_the_Linked_List().middleNode1(head).val);
    }

    ListNode middleNode1(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ListNode middleNode2(ListNode head) {
        int length = 0;
        ListNode nextNode = head;

        while (nextNode != null) {
            nextNode = nextNode.next;
            length++;
        }

        int pos;
        if (length % 2 == 0) pos = length / 2;
        else pos = length / 2 + 1;

        while (length != pos) {
            head = head.next;
            length--;
        }

        return head;
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


