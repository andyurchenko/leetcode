package edu.leetcode.problems.problem_144;

import edu.leetcode.auxiliary.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalRec(root, list);
        return list;
    }

    private void preorderTraversalRec(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preorderTraversalRec(root.left, list);
            preorderTraversalRec(root.right, list);
        }
    }
}
