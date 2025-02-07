package edu.leetcode.problems.problem_100;

public class Problem_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        if (p.left == null && q.left != null || p.left != null && q.left == null) {
            return false;
        }

        if (p.right == null && q.right != null || p.right != null && q.right == null) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isValuePresented(TreeNode tree, int valueToFind) {
        if (tree == null) {
            return false;
        }

        if (tree.val == valueToFind) {
            return true;
        }

        return isValuePresented(tree.left, valueToFind) || isValuePresented(tree.right, valueToFind);
    }

//    boolean isSameTreesRec(TreeNode p, TreeNode q) {
//
//    }
}
