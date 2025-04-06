package edu.leetcode.problems.problem_110;

import edu.leetcode.auxiliary.Aux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_110Test {

    @Test
    void isBalanced() {
    }

    @Test
    void maxLengthRec() {
        Problem_110 p = new Problem_110();
        assertEquals(4, p.maxLengthRec(Aux.getTree_5()));
        assertEquals(8, p.maxLengthRec(Aux.getTree_6()));
    }

//    @Test
//    void isBalancedRec() {
//        Problem_110 p = new Problem_110();
//
//        p.isBalancedRec(Aux.getTree_7(), new Height());
//    }
}