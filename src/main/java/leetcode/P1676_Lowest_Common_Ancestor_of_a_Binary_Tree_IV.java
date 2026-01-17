package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P1676_Lowest_Common_Ancestor_of_a_Binary_Tree_IV {

    /**
     * 1676. Lowest Common Ancestor of a Binary Tree IV
     * Given the root of a binary tree and an array of TreeNode objects nodes, return the lowest common ancestor (LCA)
     * of all the nodes in nodes. All the nodes will exist in the tree, and all values of the tree's nodes are unique.
     * <p>
     * Extending the definition of LCA on Wikipedia: "The lowest common ancestor of n nodes p1, p2, ..., pn in a binary
     * tree T is the lowest node that has every pi as a descendant (where we allow a node to be a descendant of itself)
     * for every valid i". A descendant of a node x is a node y that is on the path from node x to some leaf node.
     * <p>
     * Example 1:
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], nodes = [4,7]
     * Output: 2
     * Explanation: The lowest common ancestor of nodes 4 and 7 is node 2.
     * <p>
     * Example 2:
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], nodes = [1]
     * Output: 1
     * Explanation: The lowest common ancestor of a single node is the node itself.
     * <p>
     * Example 3:
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], nodes = [7,6,2,4]
     * Output: 5
     * Explanation: The lowest common ancestor of the nodes 7, 6, 2, and 4 is node 5.
     */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode[] nodes = new TreeNode[]{root.left.right.right, root.left.right.left};
        TreeNode treeNode = new P1676_Lowest_Common_Ancestor_of_a_Binary_Tree_IV().lowestCommonAncestor(root, nodes);
        System.out.println(treeNode);
    }

    private TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {

        Set<TreeNode> nodeSet = new HashSet<>();
        for (TreeNode node : nodes) {
            nodeSet.add(node);
        }

        return findLCA(root, nodeSet);
    }

    private TreeNode findLCA(TreeNode current, Set<TreeNode> nodes) {
        if (current == null) {
            return null;
        }

        if (nodes.contains(current)) {
            return current;
        }

        TreeNode left = findLCA(current.left, nodes);
        TreeNode right = findLCA(current.right, nodes);

        if (left != null && right != null) {
            return current;
        }

        return left != null ? left : right;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
        }
    }
}
