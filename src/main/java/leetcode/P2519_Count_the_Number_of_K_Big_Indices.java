package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P2519_Count_the_Number_of_K_Big_Indices {

    /**
     * 2519. Count the Number of K-Big Indices
     * You are given a 0-indexed integer array nums and a positive integer k.
     * We call an index i k-big if the following conditions are satisfied:
     * There exist at least k different indices idx1 such that idx1 < i and nums[idx1] < nums[i].
     * There exist at least k different indices idx2 such that idx2 > i and nums[idx2] < nums[i].
     * Return the number of k-big indices.
     * <p>
     * Example 1:
     * Input: nums = [2,3,6,5,2,3], k = 2
     * Output: 2
     * Explanation: There are only two 2-big indices in nums:
     * - i = 2 --> There are two valid idx1: 0 and 1. There are three valid idx2: 2, 3, and 4.
     * - i = 3 --> There are two valid idx1: 0 and 1. There are two valid idx2: 3 and 4.
     * <p>
     * Example 2:
     * Input: nums = [1,1,1], k = 3
     * Output: 0
     * Explanation: There are no 3-big indices in nums.
     */

    public static void main(String[] args) {
        var nums1 = new int[]{2, 3, 6, 5, 2, 3};
        var k1 = 2;
        int res = new P2519_Count_the_Number_of_K_Big_Indices().kBigIndicesPriorityQueue(nums1, k1);
        System.out.println(res);
    }

    private int kBigIndicesPriorityQueue(int[] nums, int k) {

        var length = nums.length;
        boolean[] flags = new boolean[length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (var i = 0; i < length; i++) {
            if (pq.size() == k && pq.peek() < nums[i]) {
                flags[i] = true;
            }

            pq.offer(nums[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        pq.clear();

        var counter = 0;

        for (var i = length - 1; i >= 0; i--) {
            if (pq.size() == k && pq.peek() < nums[i] && flags[i]) {
                counter++;
            }

            pq.offer(nums[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return counter;
    }


    private int kBigIndicesBruteForce(int[] nums, int k) {

        var length = nums.length;
        var result = 0;

        if (k >= length) {
            return result;
        }

        for (int i = k; i < length; i++) {

            var countLessBefore = 0;
            var countLessAfter = 0;

            for (var j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    countLessBefore++;
                }
                if (countLessBefore >= k) {
                    break;
                }
            }

            for (var j = i + 1; j < length; j++) {
                if (nums[j] < nums[i]) {
                    countLessAfter++;
                }
                if (countLessAfter >= k) {
                    break;
                }
            }

            if (countLessBefore >= k && countLessAfter >= k) {
                result++;
            }
        }

        return result;
    }

    private int kBigIndicesFenwickTree(int[] nums, int k) {
        int n = nums.length;
        if (k >= n) return 0;

        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ranks.putIfAbsent(sortedNums[i], ranks.size() + 1);
        }

        int[] leftCounts = new int[n];
        int[] rightCounts = new int[n];
        FenwickTree tree = new FenwickTree(n);

        for (int i = 0; i < n; i++) {
            int rank = ranks.get(nums[i]);
            leftCounts[i] = tree.query(rank - 1);
            tree.update(rank, 1);
        }

        tree = new FenwickTree(n);

        for (int i = n - 1; i >= 0; i--) {
            int rank = ranks.get(nums[i]);
            rightCounts[i] = tree.query(rank - 1);
            tree.update(rank, 1);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (leftCounts[i] >= k && rightCounts[i] >= k) {
                count++;
            }
        }

        return count;
    }

    private class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree(int size) {
            this.size = size;
            this.tree = new int[size + 1];
        }

        public void update(int index, int delta) {
            while (index <= size) {
                tree[index] += delta;
                index += index & (-index);
            }
        }

        public int query(int index) {
            int sum = 0;
            while (index > 0) {
                sum += tree[index];
                index -= index & (-index);
            }
            return sum;
        }
    }
}
