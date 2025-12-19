package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;

public class P0739_Daily_Temperatures {

    /**
     * Given an array of integers temperatures represents the daily temperatures, return an array answer such
     * that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
     * If there is no future day for which this is possible, keep answer[i] == 0 instead.
     * <p>
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     * <p>
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     * <p>
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(new P0739_Daily_Temperatures().dailyTemperatures1(temperatures)));
    }

    int[] dailyTemperatures1(int[] temperatures) {
        var n = temperatures.length;
        var res = new int[n];
        var stack = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                var index = stack.pop();
                res[index] = i - index;
            }
            stack.push(i);
        }
        return res;
    }

    int[] dailyTemperatures2(int[] temperatures) {
        var res = new int[temperatures.length];
        for (var i = 0; i < temperatures.length; i++) {
            for (var j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}
