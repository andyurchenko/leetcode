package edu.leetcode.problems.problem_231;

public class Problem_231 {

    public boolean isPowerOfTwo(int n) {
        return n >= 0 && (n & n - 1) == 0;
    }
}
