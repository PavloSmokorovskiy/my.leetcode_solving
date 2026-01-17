package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0636_Exclusive_Time_of_Functions {

    /**
     * On a single-threaded CPU, we execute a program containing n functions.
     * Each function has a unique ID between 0 and n-1.
     * <p>
     * Function calls are stored in a call stack: when a function call starts,
     * its ID is pushed onto the stack, and when a function call ends, its ID is popped off the stack.
     * The function whose ID is at the top of the stack is the current function being executed.
     * Each time a function starts or ends, we write a log with the ID, whether it started or ended, and the timestamp.
     * <p>
     * You are given a list logs, where logs[i] represents the ith log message formatted as a string
     * "{function_id}:{"start" | "end"}:{timestamp}". For example, "0:start:3" means a function call with
     * function ID 0 started at the beginning of timestamp 3, and "1:end:2" means a function call with function ID 1
     * ended at the end of timestamp 2. Note that a function can be called multiple times, possibly recursively.
     * <p>
     * A function's exclusive time is the sum of execution times for all function calls in the program. For example,
     * if a function is called twice, one call executing for 2 time units and another call executing for 1 time unit,
     * the exclusive time is 2 + 1 = 3.
     * <p>
     * Return the exclusive time of each function in an array, where the value at the ith index represents the exclusive
     * time for the function with ID i.
     * <p>
     * Example 1:
     * Input: n = 2, logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
     * Output: [3,4]
     * Explanation:
     * Function 0 starts at the beginning of time 0, then it executes 2 for units of time and reaches the end of time 1.
     * Function 1 starts at the beginning of time 2, executes for 4 units of time, and ends at the end of time 5.
     * Function 0 resumes execution at the beginning of time 6 and executes for 1 unit of time.
     * So function 0 spends 2 + 1 = 3 units of total time executing, and function 1 spends 4 units of total time executing.
     * <p>
     * Example 2:
     * Input: n = 1, logs = ["0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7"]
     * Output: [8]
     * Explanation:
     * Function 0 starts at the beginning of time 0, executes for 2 units of time, and recursively calls itself.
     * Function 0 (recursive call) starts at the beginning of time 2 and executes for 4 units of time.
     * Function 0 (initial call) resumes execution then immediately calls itself again.
     * Function 0 (2nd recursive call) starts at the beginning of time 6 and executes for 1 unit of time.
     * Function 0 (initial call) resumes execution at the beginning of time 7 and executes for 1 unit of time.
     * So function 0 spends 2 + 4 + 1 + 1 = 8 units of total time executing.
     * <p>
     * Example 3:
     * Input: n = 2, logs = ["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]
     * Output: [7,1]
     * Explanation:
     * Function 0 starts at the beginning of time 0, executes for 2 units of time, and recursively calls itself.
     * Function 0 (recursive call) starts at the beginning of time 2 and executes for 4 units of time.
     * Function 0 (initial call) resumes execution then immediately calls function 1.
     * Function 1 starts at the beginning of time 6, executes 1 unit of time, and ends at the end of time 6.
     * Function 0 resumes execution at the beginning of time 6 and executes for 2 units of time.
     * So function 0 spends 2 + 4 + 1 = 7 units of total time executing, and function 1 spends 1 unit of total time executing.
     */

    public static void main(String[] args) {
        var n = 2;
        List<String> logs = new ArrayList<>();
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");
        System.out.println(Arrays.toString(new P0636_Exclusive_Time_of_Functions().exclusiveTime(n, logs)));
    }

    private int[] exclusiveTime(int n, List<String> logs) {

        var res = new int[n];
        var stack = new ArrayDeque<Integer>();
        var prev = 0;

        for (var log : logs) {
            var p = log.split(":");
            var id = Integer.parseInt(p[0]);
            var type = p[1];
            var t = Integer.parseInt(p[2]);

            if (type.equals("start")) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += t - prev;
                    stack.push(id);
                    prev = t;
                } else {
                    stack.push(id);
                }
            } else {
                res[stack.peek()] += t - prev + 1;
                stack.pop();
                prev = t + 1;
            }
        }
        return res;
    }
}
