package edu.leetcode.problems.problem_191;

public class Problem_191 {
    public int hammingWeight(int n) {
        int setBitCounter = 0;
        for (int i = 0; i < 32; i++) {
            setBitCounter += n & 0b1;
            n >>= 1;
        }

        return setBitCounter;
    }
}
