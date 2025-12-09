import java.util.HashMap;
import java.util.Map;

public class InterviewTask1 {
    /**
     * Number of pairs in Array
     * <p>
     * Write java function which calculates number of pairs in array.
     * Pair is when two numbers added together, result is zero.
     */

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, -2, 3, 4, 4, -4, -4, -5, 0};
        countPairs1(arr);
        System.out.println("--------''--------");
        countPairs2(arr);

    }

    static void countPairs1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int i : arr) {

            int opposite = -i;
            Integer count = map.get(opposite);
            if (count != null && count > 0) {
                pairs++;
                if (count == 1) {
                    map.remove(opposite);
                } else {
                    map.put(opposite, count - 1);
                }
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            System.out.println(pairs);
            System.out.println(map);
        }
    }

    static void countPairs2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int i : arr) {

            int opposite = -i;

            if (map.containsKey(opposite) && map.get(opposite) != 0) {
                pairs++;
                map.put(opposite, map.getOrDefault(opposite, 0) - 1);
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            System.out.println(pairs);
            System.out.println(map);
        }
    }
}
