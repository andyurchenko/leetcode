package edu.leetcode.problems.problem_374;

public class GuessGame {
    private int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    protected int guess(int n) {
        if (n > pick) return -1;
        if (n < pick) return 1;

        return 0;
    }
}
