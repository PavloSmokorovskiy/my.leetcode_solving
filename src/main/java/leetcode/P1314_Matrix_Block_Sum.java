package leetcode;

import java.util.Arrays;

public class P1314_Matrix_Block_Sum {

    /**
     * 1314. Matrix Block Sum
     * Given a m x n matrix mat and an integer k, return a matrix answer where each answer[i][j] is the sum of all elements mat[r][c] for:
     * i - k <= r <= i + k,
     * j - k <= c <= j + k, and
     * (r, c) is a valid position in the matrix.
     * <p>
     * Example 1:
     * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
     * Output: [[12,21,16],[27,45,33],[24,39,28]]
     * <p>
     * Example 2:
     * Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
     * Output: [[45,45,45],[45,45,45],[45,45,45]]
     */

    public static void main(String[] args) {
        var mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        var k = 1;
        System.out.println(Arrays.deepToString(new P1314_Matrix_Block_Sum().matrixBlockSum(mat, k)));
    }

    private int[][] matrixBlockSum(int[][] mat, int k) {

        return null;
    }
}
