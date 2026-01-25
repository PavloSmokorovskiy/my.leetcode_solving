package leetcode;

public class P0138_Copy_List_with_Random_Pointer {

    /**
     * 138. Copy List with Random Pointer
     * A linked list of length n is given such that each node contains an additional random pointer, which could point
     * to any node in the list, or null.
     * <p>
     * Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node
     * has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes
     * should point to new nodes in the copied list such that the pointers in the original list and copied list represent
     * the same list state. None of the pointers in the new list should point to nodes in the original list.
     * <p>
     * For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding
     * two nodes x and y in the copied list, x.random --> y.
     * <p>
     * Return the head of the copied linked list.
     * <p>
     * The linked list is represented in the input/output as a list of n nodes. Each node is represented as a pair of
     * [val, random_index] where:
     * <p>
     * val: an integer representing Node.val
     * random_index: the index of the node (range from 0 to n-1) that the random pointer points to, or null if it does
     * not point to any node.
     * Your code will only be given the head of the original linked list.
     * <p>
     * Example 1:
     * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
     * <p>
     * Example 2:
     * Input: head = [[1,1],[2,1]]
     * Output: [[1,1],[2,1]]
     * <p>
     * Example 3:
     * Input: head = [[3,null],[3,0],[3,null]]
     * Output: [[3,null],[3,0],[3,null]]
     */

    public static void main(String[] args) {
        // Example 1: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node head = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);

        // Link next pointers
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Link random pointers: [7,null],[13,0],[11,4],[10,2],[1,0]
        head.random = null;      // index null
        node1.random = head;     // index 0
        node2.random = node4;    // index 4
        node3.random = node2;    // index 2
        node4.random = head;     // index 0

        P0138_Copy_List_with_Random_Pointer solution = new P0138_Copy_List_with_Random_Pointer();

        Node current = solution.copyRandomList(head);
        ;
        while (current != null) {
            String randomVal = current.random != null ? String.valueOf(current.random.val) : "null";
            System.out.println("Node val: " + current.val + ", Random points to: " + randomVal);
            current = current.next;
        }
    }

    private Node copyRandomList(Node head) {
        return null;
    }

    private static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
