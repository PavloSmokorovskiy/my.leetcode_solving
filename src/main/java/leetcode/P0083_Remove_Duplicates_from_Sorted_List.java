package leetcode;

public class P0083_Remove_Duplicates_from_Sorted_List {

    /**
     * 83. Remove Duplicates from Sorted List
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
     * Return the linked list sorted as well.
     * <p>
     * Example 1:
     * Input: head = [1,1,2]
     * Output: [1,2]
     * <p>
     * Example 2:
     * Input: head = [1,1,2,3,3]
     * Output: [1,2,3]
     */

    public static void main(String[] args) {
        var head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode list = new P0083_Remove_Duplicates_from_Sorted_List().deleteDuplicates(head);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }

    private ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) current.next = current.next.next;
            else current = current.next;
        }

        return head;
    }

    private static class ListNode {
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
