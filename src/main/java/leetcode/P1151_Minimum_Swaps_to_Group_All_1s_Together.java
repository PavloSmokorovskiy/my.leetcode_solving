package leetcode;

public class P1151_Minimum_Swaps_to_Group_All_1s_Together {

    /**
     * 1151. Minimum Swaps to Group All 1's Together
     * Given a binary array data, return the minimum number of swaps required to group all 1’s present in the array together in any place in the array.
     * <p>
     * Example 1:
     * Input: data = [1,0,1,0,1]
     * Output: 1
     * Explanation: There are 3 ways to group all 1's together:
     * [1,1,1,0,0] using 1 swap.
     * [0,1,1,1,0] using 2 swaps.
     * [0,0,1,1,1] using 1 swap.
     * The minimum is 1.
     * <p>
     * Example 2:
     * Input: data = [0,0,0,1,0]
     * Output: 0
     * Explanation: Since there is only one 1 in the array, no swaps are needed.
     * <p>
     * Example 3:
     * Input: data = [1,0,1,0,1,0,0,1,1,0,1]
     * Output: 3
     * Explanation: One possible solution that uses 3 swaps is [0,0,0,0,0,1,1,1,1,1,1].
     */

    public static void main(String[] args) {
        int[] data1 = {1, 0, 1, 0, 1};
        int res1 = new P1151_Minimum_Swaps_to_Group_All_1s_Together().minSwaps(data1);
        System.out.println(res1);

        int[] data2 = {1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1};
        int res2 = new P1151_Minimum_Swaps_to_Group_All_1s_Together().minSwaps(data2);
        System.out.println(res2);
    }

    private int minSwaps(int[] data) {

        var totalOnes = 0;
        for (var i : data) {
            totalOnes += i;
        }

        var currentOnes = 0;
        for (var i = 0; i < totalOnes; i++) {
            if (data[i] == 1) {
                currentOnes++;
            }
        }

        var minZeroes = totalOnes - currentOnes;
        for (int i = totalOnes; i < data.length; i++) {
            if (data[i] == 1) {
                currentOnes++;
            }
            if (data[i - totalOnes] == 1) {
                currentOnes--;
            }
            minZeroes = Math.min(minZeroes, totalOnes - currentOnes);
        }

        return minZeroes;
    }
}
