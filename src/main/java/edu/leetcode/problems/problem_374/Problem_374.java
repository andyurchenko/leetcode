package edu.leetcode.problems.problem_374;

public class Problem_374 extends GuessGame {
    private static int GUESS_IS_HIGHER = -1;
    private static int GUESS_IS_LOWER = 1;
    private static int MATCH = 0;


    public Problem_374(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        return guessNumberIter(0, n);
    }

    private int guessNumberIter(int leftPosition, int rightPosition) {
        int temp = (rightPosition - leftPosition) / 2;
        if (temp == 0) {
            temp = 1;
        }
        int res = guess(leftPosition + temp);

        if (res == GUESS_IS_LOWER) {
            return guessNumberIter(leftPosition + temp, rightPosition);
        }
        if (res == GUESS_IS_HIGHER){
            return guessNumberIter(leftPosition, rightPosition - temp);
        }

        return leftPosition + temp;
    }
}
