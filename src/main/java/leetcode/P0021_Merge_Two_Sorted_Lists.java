package leetcode;

public class P0021_Merge_Two_Sorted_Lists {

    /**
     * You are given the heads of two sorted linked lists list1 and list2.
     * <p>
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     * <p>
     * Return the head of the merged linked list.
     * <p>
     * Example 1:
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * <p>
     * Example 2:
     * Input: list1 = [], list2 = []
     * Output: []
     * <p>
     * Example 3:
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     */

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = new P0021_Merge_Two_Sorted_Lists().mergeTwoLists(list1, list2);
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode index = res;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                index.next = list1;
                list1 = list1.next;
            } else {
                index.next = list2;
                list2 = list2.next;
            }
            index = index.next;
        }

        index.next = (list1 != null) ? list1 : list2;

        return res.next;
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

