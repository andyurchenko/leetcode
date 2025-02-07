package edu.leetcode.problems.problem_226;

import edu.leetcode.auxiliary.TreeNode;

public class Problem_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode duplicate = new TreeNode();
        reversedTreeDuplicate(root, duplicate);

        return duplicate;
    }

    void rec(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            rec(node.left);
            rec(node.right);
        }
    }

    void reversedTreeDuplicate(TreeNode original, TreeNode duplicate) {
        if (original != null) {
            duplicate.val = original.val;
            if (original.left != null) {
                duplicate.right = new TreeNode();
                reversedTreeDuplicate(original.left, duplicate.right);
            }

            if (original.right != null) {
                duplicate.left = new TreeNode();
                reversedTreeDuplicate(original.right, duplicate.left);
            }
        }
    }

    void duplicateTree(TreeNode original, TreeNode duplicate) {
        if (original != null) {
            duplicate.val = original.val;
            if (original.left != null) {
                duplicate.left = new TreeNode();
                reversedTreeDuplicate(original.left, duplicate.left);
            }

            if (original.right != null) {
                duplicate.right = new TreeNode();
                reversedTreeDuplicate(original.right, duplicate.right);
            }
        }
    }
}
