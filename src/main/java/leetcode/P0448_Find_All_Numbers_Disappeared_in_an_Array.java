package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P0448_Find_All_Numbers_Disappeared_in_an_Array {

    /**
     * Given an array nums of n integers where nums[i] is in the range [1, n],
     * return an array of all the integers in the range [1, n]
     * that do not appear in nums.
     * <p>
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [5,6]
     * <p>
     * Example 2:
     * Input: nums = [1,1]
     * Output: [2]
     */

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(new P0448_Find_All_Numbers_Disappeared_in_an_Array().findDisappearedNumbers(nums));
    }

    List<Integer> findDisappearedNumbers(int[] nums) {
        var res = new ArrayList<Integer>();
        var seen = new boolean[nums.length + 1];

        for (int num : nums)
            seen[num] = true;

        for (int i = 1; i < seen.length; i++)
            if (!seen[i])
                res.add(i);

        return res;
    }
}
