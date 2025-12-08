package leetcode;

public class P2011_Final_Value_of_Variable_After_Performing_Operations {
    /**
     * 2011. Final Value of Variable After Performing Operations <a href=>https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/</a><p>
     * There is a programming language with only four operations and one variable X:<p>
     * <p>
     * ++X and X++ increments the value of the variable X by 1.<p>
     * --X and X-- decrements the value of the variable X by 1.<p>
     * Initially, the value of X is 0.<p>
     * <p>
     * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.<p>
     * <p>
     * Example 1:<p>
     * Input: operations = ["--X","X++","X++"]<p>
     * Output: 1<p>
     * Explanation: The operations are performed as follows:<p>
     * Initially, X = 0.<p>
     * --X: X is decremented by 1, X =  0 - 1 = -1.<p>
     * X++: X is incremented by 1, X = -1 + 1 =  0.<p>
     * X++: X is incremented by 1, X =  0 + 1 =  1.<p>
     * <p>
     * Example 2:<p>
     * Input: operations = ["++X","++X","X++"]<p>
     * Output: 3<p>
     * Explanation: The operations are performed as follows:<p>
     * Initially, X = 0.<p>
     * ++X: X is incremented by 1, X = 0 + 1 = 1.<p>
     * ++X: X is incremented by 1, X = 1 + 1 = 2.<p>
     * X++: X is incremented by 1, X = 2 + 1 = 3.<p>
     * <p>
     * Example 3:<p>
     * Input: operations = ["X++","++X","--X","X--"]<p>
     * Output: 0<p>
     * Explanation: The operations are performed as follows:<p>
     * Initially, X = 0.<p>
     * X++: X is incremented by 1, X = 0 + 1 = 1.<p>
     * ++X: X is incremented by 1, X = 1 + 1 = 2.<p>
     * --X: X is decremented by 1, X = 2 - 1 = 1.<p>
     * X--: X is decremented by 1, X = 1 - 1 = 0.<p>
     */
    public static void main(String[] args) {
        String[] input = {"--X", "X++", "X++"};
        int res = new P2011_Final_Value_of_Variable_After_Performing_Operations().finalValueAfterOperations(input);
        System.out.println(res);
    }

    public int finalValueAfterOperations(String[] operations) {

        var res = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X" -> ++res;
                case "X++" -> res++;
                case "--X" -> --res;
                case "X--" -> res--;
            }
        }
        return res;
    }
}
