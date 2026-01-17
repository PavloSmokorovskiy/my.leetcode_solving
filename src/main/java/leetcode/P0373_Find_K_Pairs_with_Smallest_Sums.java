package leetcode;

import java.util.*;

public class P0373_Find_K_Pairs_with_Smallest_Sums {

    /**
     * You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.
     * <p>
     * Define a pair (u, v) which consists of one element from the first array and one element from the second array.
     * <p>
     * Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
     * <p>
     * Example 1:
     * Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
     * Output: [[1,2],[1,4],[1,6]]
     * Explanation: The first 3 pairs are returned from
     * the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
     * <p>
     * Example 2:
     * Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
     * Output: [[1,1],[1,1]]
     * Explanation: The first 2 pairs are returned from
     * the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
     */

    public static void main(String[] args) {
        var nums1 = new int[]{1, 7, 11};
        var nums2 = new int[]{2, 4, 6};
        var k = 3;
        System.out.println(new P0373_Find_K_Pairs_with_Smallest_Sums().kSmallestPairs(nums1, nums2, k));
    }

    private List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Coord> visited = new HashSet<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]));

        int[] cur = new int[]{0, 0};
        heap.add(cur);
        visited.add(new Coord(0, 0));

        for (int count = 0; count < k && !heap.isEmpty(); count++) {
            cur = heap.poll();
            int i = cur[0];
            int j = cur[1];

            res.add(Arrays.asList(nums1[i], nums2[j]));

            if (i + 1 < nums1.length && visited.add(new Coord(i + 1, j))) {
                heap.offer(new int[]{i + 1, j});
            }

            if (j + 1 < nums2.length && visited.add(new Coord(i, j + 1))) {
                heap.offer(new int[]{i, j + 1});
            }
        }

        return res;
    }

    private record Coord(int i, int j) {
    }
}
