package edu.leetcode.problems.problem_110;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_110 {
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) - minDepth(root) < 2;
    }

    int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftTree = maxDepth(node.left);
        int rightTree = maxDepth(node.right);

        return Math.max(leftTree, rightTree) + 1;
    }

    int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftTree = minDepth(node.left);
        int rightTree = minDepth(node.right);

        return Math.min(leftTree, rightTree) + 1;
    }
}
