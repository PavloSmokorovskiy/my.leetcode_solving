package leetcode;

public class P0328_Odd_Even_Linked_List {

    /**
     * 328. Odd Even Linked List
     * Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with
     * even indices, and return the reordered list.
     * <p>
     * The first node is considered odd, and the second node is even, and so on.
     * <p>
     * Note that the relative order inside both the even and odd groups should remain as it was in the input.
     * <p>
     * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
     * <p>
     * Example 1:
     * Input: head = [1,2,3,4,5]
     * Output: [1,3,5,2,4]
     * <p>
     * Example 2:
     * Input: head = [2,1,3,5,6,4,7]
     * Output: [2,3,6,7,1,5,4]
     */

    public static void main(String[] args) {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(new P0328_Odd_Even_Linked_List().oddEvenList(head));
    }

    private ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            //link the current odd node to the next odd
            odd.next = odd.next.next;
            //move odd pointer next
            odd = odd.next;
            //link the current even node to the next even
            even.next = even.next.next;
            //move even pointer next
            even = even.next;
        }
        //link the tail of odd to the head of even
        odd.next = evenHead;
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
