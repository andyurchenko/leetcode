package edu.leetcode.problems.problem_222;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_222 {
    public int countNodes(TreeNode root) {
        return countNodesRec(root);
    }

    private int countNodesRec(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = countNodesRec(root.left);
        int right = countNodesRec(root.right);

        return left + right + 1;
    }
}
