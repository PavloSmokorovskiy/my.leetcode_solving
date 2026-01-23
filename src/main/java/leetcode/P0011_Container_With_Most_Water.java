package leetcode;

public class P0011_Container_With_Most_Water {

    /**
     * 11. Container With Most Water
     * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
     * of the ith line are (i, 0) and (i, height[i]).
     * <p>
     * Find two lines that together with the x-axis form a container, such that the container contains the most water.
     * <p>
     * Return the maximum amount of water a container can store.
     * <p>
     * Notice that you may not slant the container.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area
     * of water (blue section) the container can contain is 49.
     * <p>
     * Example 2:
     * Input: height = [1,1]
     * Output: 1
     */

    public static void main(String[] args) {
        var height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new P0011_Container_With_Most_Water().maxArea(height));
    }

    private int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int leftHeight = height[left];
            int rightHeight = height[right];
            int area = Math.min(leftHeight, rightHeight) * width;
            maxArea = Math.max(maxArea, area);

            if (leftHeight < rightHeight) left++;
            else right--;
        }

        return maxArea;
    }
}
