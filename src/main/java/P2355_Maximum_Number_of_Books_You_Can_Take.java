import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class P2355_Maximum_Number_of_Books_You_Can_Take {
    /*
    2355. Maximum Number of Books You Can Take https://leetcode.com/problems/maximum-number-of-books-you-can-take/description
You are given a 0-indexed integer array books of length n where books[i] denotes the number of books on the ith shelf of a bookshelf.
You are going to take books from a contiguous section of the bookshelf spanning from l to r where 0 <= l <= r < n. For each index i in the range l <= i < r, you must take strictly fewer books from shelf i than shelf i + 1.
Return the maximum number of books you can take from the bookshelf.

Example 1:
Input: books = [8,5,2,7,9]
Output: 19
Explanation:
- Take 1 book from shelf 1.
- Take 2 books from shelf 2.
- Take 7 books from shelf 3.
- Take 9 books from shelf 4.
You have taken 19 books, so return 19.
It can be proven that 19 is the maximum number of books you can take.

Example 2:
Input: books = [7,0,3,4,5]
Output: 12
Explanation:
- Take 3 books from shelf 2.
- Take 4 books from shelf 3.
- Take 5 books from shelf 4.
You have taken 12 books so return 12.
It can be proven that 12 is the maximum number of books you can take.

Example 3:
Input: books = [8,2,3,7,3,4,0,1,4,3]
Output: 13
Explanation:
- Take 1 book from shelf 0.
- Take 2 books from shelf 1.
- Take 3 books from shelf 2.
- Take 7 books from shelf 3.
You have taken 13 books so return 13.
It can be proven that 13 is the maximum number of books you can take.
     */

    public static void main(String[] args) {

        int[] books1 = {8, 5, 2, 7, 9};
        long res1 = new P2355_Maximum_Number_of_Books_You_Can_Take().maximumBooksFast(books1);
        System.out.println("Exp: 19: " + res1);

//        int[] books2 = {7, 0, 3, 4, 5};
//        long res2 = new P2355_Maximum_Number_of_Books_You_Can_Take().maximumBooks(books2);
//        System.out.println("Exp: 12: " + res2);

    }

    long maximumBooksFast(int[] books) {
        int n = books.length;
        int[] left = new int[n];

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top != -1 && books[stack[top]] - stack[top] >= books[i] - i)
                top--;
            left[i] = top == -1 ? -1 : stack[top];
            stack[++top] = i;
        }

        long[] dp = new long[n];
        dp[0] = books[0];
        for (int i = 1; i < n; i++) {

            int j = left[i];
            int count = Math.min(i - j, books[i]);
            int last = books[i];
            int first = books[i] - count + 1;
            long sum = (long) (first + last) * count >> 1;
            if (j == -1)
                dp[i] = sum;
            else
                dp[i] = dp[j] + sum;
        }

        long ans = 0;
        for (long x : dp)
            ans = Math.max(ans, x);

        return ans;
    }

    long maximumBooksMedium(int[] books) {

        int n = books.length;
        int[] diff = new int[n];
        int[] leftSmaller = new int[n];
        Arrays.fill(leftSmaller, -1);
        long[] dp = new long[n];
        List<int[]> stack = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            diff[i] = books[i] - i;
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.get(stack.size() - 1)[0] >= diff[i]) {
                stack.remove(stack.size() - 1);
            }

            if (!stack.isEmpty()) {
                leftSmaller[i] = stack.get(stack.size() - 1)[1];
            }
            stack.add(new int[]{diff[i], i});
        }

        dp[0] = books[0];
        long max = books[0];
        for (int i = 1; i < n; i++) {
            int prevSmaller = leftSmaller[i];
            if (prevSmaller != -1) {
                long elementsToTheRight = i - prevSmaller;
                long firstValue = books[i] - elementsToTheRight + 1;
                long sum = (firstValue + books[i]) * elementsToTheRight / 2;
                dp[i] = Math.max(sum, sum + dp[prevSmaller]);
            } else {
                long elementsToTheRight = Math.min(i + 1, books[i]);
                long firstValue = books[i] - elementsToTheRight + 1;
                long sum = (firstValue + books[i]) * elementsToTheRight / 2;
                dp[i] = sum;
            }
        }

        for (long i : dp) {
            max = Math.max(max, i);
        }

        return max;
    }

    long maximumBooksBruteForce(int[] books) {
        int big, less, max = books[0];

        for (var i = 1; i < books.length; i++) {
            big = less = books[i];
            for (int j = i; j > 0; j--) {
                big += less = Math.min(less > 0 ? --less : 0, books[j - 1]);
            }
            max = Math.max(big, max);
        }

        return max;
    }
}
