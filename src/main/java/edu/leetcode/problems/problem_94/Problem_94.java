package edu.leetcode.problems.problem_94;
import java.util.ArrayList;
import java.util.List;

public class Problem_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        selectInorderElementsRec(root, list);

        return list;
    }

    void selectInorderElementsRec(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            selectInorderElementsRec(node.left, list);
        }

        list.add(node.val);

        if (node.right != null) {
            selectInorderElementsRec(node.right, list);
        }
    }
}
