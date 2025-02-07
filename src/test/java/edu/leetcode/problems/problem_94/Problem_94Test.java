package edu.leetcode.problems.problem_94;

import org.junit.jupiter.api.Test;
import edu.leetcode.problems.problem_94.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_94Test {

    @Test
    void inorderTraversal() {
        Problem_94 p = new Problem_94();
        TreeNode root = new TreeNode();
        root.val = 1;
        TreeNode l2 = new TreeNode();
        l2.val = 2;
        TreeNode l3 = new TreeNode();
        l3.val = 3;
        root.left = l2;
        root.right = l3;
        TreeNode l4 = new TreeNode();
        l4.val = 4;
        TreeNode l5 = new TreeNode();
        l5.val = 5;
        l2.left = l4;
        l2.right = l5;
        TreeNode l6 = new TreeNode();
        l6.val = 6;
        TreeNode l7 = new TreeNode();
        l7.val = 7;
        l5.left = l6;
        l5.right = l7;
        TreeNode l8 = new TreeNode();
        l8.val = 8;
        TreeNode l9 = new TreeNode();
        l9.val = 9;
        l3.right = l8;
        l8.left = l9;
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(8);
        List<Integer> listResulted = p.inorderTraversal(root);
        for (int i = 0; i < 9; i++) {
            assertEquals(list.get(i), listResulted.get(i));
        }


    }
}