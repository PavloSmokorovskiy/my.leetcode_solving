package leetcode;

import java.util.ArrayDeque;

public class P0084_Largest_Rectangle_in_Histogram {

    /**
     * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1,
     * return the area of the largest rectangle in the histogram.
     * <p>
     * Example 1:
     * Input: heights = [2,1,5,6,2,3]
     * Output: 10
     * Explanation: The above is a histogram where width of each bar is 1.
     * The largest rectangle is shown in the red area, which has an area = 10 units.
     * <p>
     * Example 2:
     * Input: heights = [2,4]
     * Output: 4
     */

    public static void main(String[] args) {
        int[] heights = {2, 0, 5, 6, 2, 3};
        System.out.println(new P0084_Largest_Rectangle_in_Histogram().largestRectangleArea1(heights));
    }

    private int largestRectangleArea1(int[] heights) {
        var stack = new ArrayDeque<Integer>();
        var n = heights.length;
        var maxArea = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                var h = heights[stack.pop()];
                var leftLess = stack.isEmpty() ? -1 : stack.peek();
                var width = i - leftLess - 1;
                maxArea = Math.max(maxArea, h * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            var h = heights[stack.pop()];
            var leftLess = stack.isEmpty() ? -1 : stack.peek();
            var width = n - leftLess - 1;
            maxArea = Math.max(maxArea, h * width);
        }

        return maxArea;
    }

    private int largestRectangleArea2(int[] heights) {
        var res = 0;
        var n = heights.length;
        var stack = new ArrayDeque<int[]>();

        for (int i = 0; i < n; i++) {
            var start = i;
            var h = heights[i];

            while (!stack.isEmpty() && stack.peek()[1] > h) {
                var top = stack.pop();
                var topStart = top[0];
                var topH = top[1];
                int area = topH * (i - topStart);
                res = Math.max(res, area);
                start = topStart;
            }
            stack.push(new int[]{start, heights[i]});
        }

        while (!stack.isEmpty()) {
            var top = stack.pop();
            var topStart = top[0];
            var topH = top[1];
            var area = topH * (n - topStart);
            res = Math.max(res, area);
        }

        return res;
    }
}
