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
        System.out.println(new P0083_Remove_Duplicates_from_Sorted_List().deleteDuplicates(head));
    }

    private ListNode deleteDuplicates(ListNode head) {

        return null;
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
