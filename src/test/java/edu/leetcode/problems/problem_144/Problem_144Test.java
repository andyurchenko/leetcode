package edu.leetcode.problems.problem_144;

import edu.leetcode.auxiliary.Aux;
import edu.leetcode.auxiliary.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_144Test {

    @Test
    void preorderTraversal() {
        Problem_144 p = new Problem_144();
        List<Integer> list = p.preorderTraversal(Aux.getTree_5());
    }
}