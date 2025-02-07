package edu.leetcode.problems.problem_35;

public class Problem_35 {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i] || nums[i] == target) {
                return i;
            }
        }

        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0] || target == nums[0]) {
            return 0;
        }
        int possibleIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            }
        }

        return nums.length;
    }
}
