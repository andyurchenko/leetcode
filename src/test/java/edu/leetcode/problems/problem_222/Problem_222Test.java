package edu.leetcode.problems.problem_222;

import edu.leetcode.auxiliary.Aux;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_222Test {


    @Test
    void countNodes() {
        Problem_222 p = new Problem_222();
        assertEquals(0, p.countNodes(null));
        assertEquals(9, p.countNodes(Aux.getTree_5()));

    }
}