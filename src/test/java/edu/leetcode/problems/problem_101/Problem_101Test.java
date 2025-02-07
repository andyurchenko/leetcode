package edu.leetcode.problems.problem_101;

import edu.leetcode.auxiliary.Aux;
import edu.leetcode.auxiliary.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_101Test {

    @Test
    void isSymmetric() {
        TreeNode root = Aux.getTree_2();
        Problem_101 p = new Problem_101();
        assertTrue(p.isSymmetric(root));
        assertFalse(p.isSymmetric(Aux.getTree_3()));
    }
}