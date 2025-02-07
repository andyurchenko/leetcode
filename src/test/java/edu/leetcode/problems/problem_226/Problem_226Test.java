package edu.leetcode.problems.problem_226;

import edu.leetcode.auxiliary.TreeNode;
import org.junit.jupiter.api.Test;
import edu.leetcode.auxiliary.Aux;

class Problem_226Test {

    @Test
    void rec() {
        TreeNode root = Aux.getTree_1();
        Problem_226 p = new Problem_226();
        p.rec(root);
    }


    @Test
    void rec2() {
        TreeNode duplicate = new TreeNode();
        Problem_226 p = new Problem_226();
        p.reversedTreeDuplicate(Aux.getTree_1(), duplicate);
        System.out.println("!!!");
    }
}