package leetcode;

import java.util.Arrays;

public class P2672_Number_of_Adjacent_Elements_With_the_Same_Color {

    /**
     * 2672. Number of Adjacent Elements With the Same Color
     * <p>
     * You are given an integer n representing an array colors of length n where all elements are set to 0's meaning uncolored.
     * You are also given a 2D integer array queries where queries[i] = [indexi, colori]. For the ith query:
     * <p>
     * Set colors[indexi] to colori.
     * Count the number of adjacent pairs in colors which have the same color (regardless of colori).
     * Return an array answer of the same length as queries where answer[i] is the answer to the ith query.
     * <p>
     * Example 1:
     * Input: n = 4, queries = [[0,2],[1,2],[3,1],[1,1],[2,1]]
     * Output: [0,1,1,0,2]
     * Explanation:
     * Initially array colors = [0,0,0,0], where 0 denotes uncolored elements of the array.
     * After the 1st query colors = [2,0,0,0]. The count of adjacent pairs with the same color is 0.
     * After the 2nd query colors = [2,2,0,0]. The count of adjacent pairs with the same color is 1.
     * After the 3rd query colors = [2,2,0,1]. The count of adjacent pairs with the same color is 1.
     * After the 4th query colors = [2,1,0,1]. The count of adjacent pairs with the same color is 0.
     * After the 5th query colors = [2,1,1,1]. The count of adjacent pairs with the same color is 2.
     * <p>
     * Example 2:
     * Input: n = 1, queries = [[0,100000]]
     * Output: [0]
     * Explanation:
     * After the 1st query colors = [100000]. The count of adjacent pairs with the same color is 0.
     */

    public static void main(String[] args) {
        var n = 4;
        var queries = new int[][]{{0, 2}, {1, 2}, {3, 1}, {1, 1}, {2, 1}};
        System.out.println(Arrays.toString(new P2672_Number_of_Adjacent_Elements_With_the_Same_Color().colorTheArray(n, queries)));
    }

    private int[] colorTheArray(int n, int[][] queries) {

        return null;
    }
}
