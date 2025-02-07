package edu.leetcode.problems.problem_104;

import edu.leetcode.auxiliary.Aux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_104Test {

    @Test
    void maxDepth() {
        Problem_104 p = new Problem_104();
        assertEquals(3, p.maxDepth(Aux.getTree_4()));

    }
}