package edu.leetcode.problems.problem_111;

import edu.leetcode.auxiliary.Aux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_111Test {

    @Test
    void minDepth() {
        Problem_111 p = new Problem_111();
        assertEquals(3, p.minDepth(Aux.getTree_5()));
        assertEquals(2, p.minDepth(Aux.getTree_4()));
        assertEquals(8, p.minDepth(Aux.getTree_6()));
    }
}