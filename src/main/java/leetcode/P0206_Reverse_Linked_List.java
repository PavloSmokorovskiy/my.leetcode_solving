package leetcode;

public class P0206_Reverse_Linked_List {
    /**
     * 206. Reverse Linked List <a href=>https://leetcode.com/problems/reverse-linked-list/description/</a><p>
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     * <p>
     * Example 1:<p>
     * Input: head = [1,2,3,4,5]<p>
     * Output: [5,4,3,2,1]<p>
     * <p>
     * Example 2:<p>
     * Input: head = [1,2]<p>
     * Output: [2,1]<p>
     * <p>
     * Example 3:<p>
     * Input: head = []<p>
     * Output: []<p>
     */

    public static void main(String[] args) throws CloneNotSupportedException {
        ListNode ln1 = new ListNode(5);
        ListNode ln2 = new ListNode(4, ln1);
        ListNode ln3 = new ListNode(3, ln2);
        ListNode ln4 = new ListNode(2, ln3);
        ListNode ln5 = new ListNode(1, ln4);

        ListNode input = (ListNode) ln5.clone();
        while (input != null) {
            System.out.print(input.val + " ");
            input = input.next;
        }
        System.out.println();

        ListNode listNode = new P0206_Reverse_Linked_List().reverseList(ln5);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    private static class ListNode implements Cloneable {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}

