package edu.leetcode.problems.problem_110;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_110 {
    public boolean isBalanced(TreeNode root) {
        return isBalancedRec(root, new Height());
    }

    public int maxLengthRec(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftLength = maxLengthRec(node.left);
        int rightLength = maxLengthRec(node.right);

        return Math.max(leftLength, rightLength) + 1;
    }

    private boolean isBalancedRec(TreeNode node, Height height) {
        if (node == null) {
            return true;
        }

        Height leftHeight = new Height();
        boolean leftIsBalanced = isBalancedRec(node.left, leftHeight);

        Height rightHeight = new Height();
        boolean rightIsBalanced = isBalancedRec(node.right, rightHeight);

        height.val = Math.max(leftHeight.val, rightHeight.val) + 1;

        if (Math.abs(leftHeight.val - rightHeight.val) > 1) {
            return false;
        } else {
            return leftIsBalanced && rightIsBalanced;
        }
    }

    public int getTreeHeight(TreeNode root){
        if (root == null) {
            return 0;
        }

        int leftHeight = getTreeHeight(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = getTreeHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    class Height {
        public int val;

        public Height() {
            val = 0;
        }
    }
}
