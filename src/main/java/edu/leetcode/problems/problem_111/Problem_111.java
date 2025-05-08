package edu.leetcode.problems.problem_111;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDepthRec(root);
    }

    private int minDepthRec(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepthRec(root.left);
        int right = minDepthRec(root.right);

        if (left != 0 && right != 0) {
            return Math.min(left, right) + 1;
        } else if (left == 0 && right != 0) {
            return  right + 1;
        } else if (left != 0) {
            return left + 1;
        } else {
            return 1;
        }
    }
}
