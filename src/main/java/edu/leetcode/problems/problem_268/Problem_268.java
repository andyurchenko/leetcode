package edu.leetcode.problems.problem_268;

import java.util.HashSet;

public class Problem_268 {

    public int missingNumber(int[] nums) {
        int fullSum = 0;
        for (int i = 1; i <= nums.length; i++) {
            fullSum += i;
        }

        int sumWithoutMissingNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            sumWithoutMissingNumber += nums[i];
        }

        return fullSum - sumWithoutMissingNumber;
    }
    public int missingNumber2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int i;
        for (i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return i;
    }
}
