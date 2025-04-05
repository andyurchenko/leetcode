package edu.leetcode.problems.problem_145;

import edu.leetcode.auxiliary.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Problem_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        return postorderTraversalRec(root, new ArrayList<>());
    }

    public List<Integer> postorderTraversalRec(TreeNode root, List<Integer> list) {
        if (root == null) {
            return list;
        }

        postorderTraversalRec(root.left, list);
        postorderTraversalRec(root.right, list);
        list.add(root.val);

        return list;
    }
}
