import java.util.*;

public class P2534_Time_Taken_to_Cross_the_Door {

    /*
    2534. Time Taken to Cross the Door https://leetcode.com/problems/time-taken-to-cross-the-door/description/
There are n persons numbered from 0 to n - 1 and a door. Each person can enter or exit through the door once, taking one second.
You are given a non-decreasing integer array arrival of size n, where arrival[i] is the arrival time of the ith person at the door. You are also given an array state of size n, where state[i] is 0 if person i wants to enter through the door or 1 if they want to exit through the door.
If two or more persons want to use the door at the same time, they follow the following rules:

If the door was not used in the previous second, then the person who wants to exit goes first.
If the door was used in the previous second for entering, the person who wants to enter goes first.
If the door was used in the previous second for exiting, the person who wants to exit goes first.
If multiple persons want to go in the same direction, the person with the smallest index goes first.
Return an array answer of size n where answer[i] is the second at which the ith person crosses the door.

Note that:
Only one person can cross the door at each second.
A person may arrive at the door and wait without entering or exiting to follow the mentioned rules.


Example 1:
Input: arrival = [0,1,1,2,4], state = [0,1,0,0,1]
Output: [0,3,1,2,4]
Explanation: At each second we have the following:
- At t = 0: Person 0 is the only one who wants to enter, so they just enter through the door.
- At t = 1: Person 1 wants to exit, and person 2 wants to enter. Since the door was used the previous second for entering, person 2 enters.
- At t = 2: Person 1 still wants to exit, and person 3 wants to enter. Since the door was used the previous second for entering, person 3 enters.
- At t = 3: Person 1 is the only one who wants to exit, so they just exit through the door.
- At t = 4: Person 4 is the only one who wants to exit, so they just exit through the door.

Example 2:
Input: arrival = [0,0,0], state = [1,0,1]
Output: [0,2,1]
Explanation: At each second we have the following:
- At t = 0: Person 1 wants to enter while persons 0 and 2 want to exit. Since the door was not used in the previous second, the persons who want to exit get to go first. Since person 0 has a smaller index, they exit first.
- At t = 1: Person 1 wants to enter, and person 2 wants to exit. Since the door was used in the previous second for exiting, person 2 exits.
- At t = 2: Person 1 is the only one who wants to enter, so they just enter through the door.
     */
    public static void main(String[] args) {
        int[] arrival1 = {0, 1, 1, 2, 4}, state1 = {0, 1, 0, 0, 1};
        int[] res1 = new P2534_Time_Taken_to_Cross_the_Door().timeTaken(arrival1, state1);
        System.out.println(Arrays.toString(res1));

        int[] arrival2 = {0, 0, 0}, state2 = {1, 0, 1};
        int[] res2 = new P2534_Time_Taken_to_Cross_the_Door().timeTaken(arrival2, state2);
        System.out.println(Arrays.toString(res2));

        int[] arrival3 = {3, 3, 4, 5, 5, 5}, state3 = {1, 0, 1, 0, 1, 0};
        int[] res3 = new P2534_Time_Taken_to_Cross_the_Door().timeTaken(arrival3, state3);
        System.out.println(Arrays.toString(res3));

        int[] arrival4 = {0, 0, 1, 2, 8, 10, 10, 10, 10, 10}, state4 = {0, 1, 0, 1, 1, 0, 0, 0, 1, 1};
        int[] res4 = new P2534_Time_Taken_to_Cross_the_Door().timeTaken(arrival4, state4);
        System.out.println(Arrays.toString(res4));

        int[] arrival5 = {73, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75},
                state5 = {0,  1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0};
        int[] res5 = new P2534_Time_Taken_to_Cross_the_Door().timeTaken(arrival5, state5);
        System.out.println(Arrays.toString(res5));
    }

    public int[] timeTaken(int[] arrival, int[] state) {
        int n = arrival.length;
        int[] answer = new int[n];
        int lastUsed = -1;
        int lastState = -1;

        Queue<Integer> entering = new LinkedList<>();
        Queue<Integer> exiting = new LinkedList<>();

        int time = 0;
        int index = 0;
        while (index < n || !entering.isEmpty() || !exiting.isEmpty()) {

            while (index < n && arrival[index] <= time) {
                if (state[index] == 0) {
                    entering.add(index);
                } else {
                    exiting.add(index);
                }
                index++;
            }

            if (time - lastUsed == 2){
                lastState = -1;
            }

            if (!exiting.isEmpty() && (entering.isEmpty() || lastState != 0)) {
                int person = exiting.poll();
                answer[person] = time;
                lastState = 1;
                lastUsed = time;
            } else if (!entering.isEmpty()) {
                int person = entering.poll();
                answer[person] = time;
                lastState = 0;
                lastUsed = time;
            }

            time++;
        }
        return answer;
    }
}
