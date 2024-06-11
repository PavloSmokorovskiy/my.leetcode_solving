import java.util.HashMap;
import java.util.Map;

public class P1512_Number_of_Good_Pairs {

    /**
     * 1512. Number of Good Pairs <a href=>https://leetcode.com/problems/number-of-good-pairs/description/</a><p>
     * Given an array of integers nums, return the number of good pairs.
     * <p>
     * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     * <p>
     * Example 1:<p>
     * Input: nums = [1,2,3,1,1,3]<p>
     * Output: 4<p>
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.<p>
     * <p>
     * Example 2:<p>
     * Input: nums = [1,1,1,1]<p>
     * Output: 6<p>
     * Explanation: Each pair in the array are good.<p>
     * <p>
     * Example 3:<p>
     * Input: nums = [1,2,3]<p>
     * Output: 0<p>
     */
    public static void main(String[] args) {
        var nums = new int[]{1, 2, 3, 1, 1, 3};
        int res = new P1512_Number_of_Good_Pairs().numIdenticalPairs1(nums);
        System.out.println(res);
    }

    int numIdenticalPairs1(int[] nums) {

        var pairs = 0;
        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs / 2;
    }

    public int numIdenticalPairs2(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;
    }
}
