package edu.leetcode.problems.problem_108;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_108 {
    public TreeNode sortedArrayToBST(final int[] nums) {
        return sortedArrayToBSTRec(nums);
    }

    public TreeNode sortedArrayToBSTRec(final int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        TreeNode middleNode = new TreeNode();

        middleNode.val = nums[nums.length / 2];

        int[] leftArr = getSubArray(0, nums.length / 2 - 1, nums);
        middleNode.left = sortedArrayToBSTRec(leftArr);

        int[] rightArr = getSubArray(nums.length / 2 + 1, nums.length - 1, nums);
        middleNode.right = sortedArrayToBSTRec(rightArr);

        return middleNode;
    }

    public int[] getSubArray(int fromIndexInclusive, int toIndexInclusive, int[] source) {
        int[] newArr = new int[toIndexInclusive - fromIndexInclusive + 1];
        for (int i = 0; i < newArr.length; i++, fromIndexInclusive++) {
            newArr[i] = source[fromIndexInclusive];
        }

        return newArr;
    }
}
