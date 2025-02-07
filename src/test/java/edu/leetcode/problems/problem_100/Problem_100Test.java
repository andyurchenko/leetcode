package edu.leetcode.problems.problem_100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_100Test {

    @Test
    void isSameTree() {
        Problem_100 p = new Problem_100();


    }

    @Test
    void testIsSameTree() {
    }

    @Test
    void isValuePresented() {
        Problem_100 p = new Problem_100();
        assertTrue(p.isValuePresented(getTree(), 10));
    }

    TreeNode getTree() {
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

        return root;
    }
}