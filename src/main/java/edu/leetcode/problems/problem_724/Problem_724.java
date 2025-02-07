package edu.leetcode.problems.problem_724;

public class Problem_724 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }

        int rightSum = 0;
        for (int e : nums) {
            rightSum += e;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
//Input: nums = [1,7,3,6,5,6]
//Output: 3
//Explanation:
//The pivot index is 3.
//Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//Right sum = nums[4] + nums[5] = 5 + 6 = 11

//Input: nums = [2,1,-1]
//Output: 0
//Explanation:
//The pivot index is 0.
//Left sum = 0 (no elements to the left of index 0)
//Right sum = nums[1] + nums[2] = 1 + -1 = 0