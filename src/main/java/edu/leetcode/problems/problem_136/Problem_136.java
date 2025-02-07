package edu.leetcode.problems.problem_136;

public class Problem_136 {
    public int singleNumber(int[] nums) {
        int disctinct = 0;
        for (int e : nums) {
            disctinct ^= e;
        }

        return disctinct;
    }
}
