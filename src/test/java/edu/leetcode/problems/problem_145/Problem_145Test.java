package edu.leetcode.problems.problem_145;

import edu.leetcode.auxiliary.Aux;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_145Test {

    @Test
    void postorderTraversal() {
        List<Integer> listExpected = List.of(4, 6, 7, 5, 2, 9, 8, 3, 1);
        Problem_145 p = new Problem_145();
        List<Integer> listReturned = p.postorderTraversal(Aux.getTree_5());
        assertEquals(listExpected, listReturned);
    }

    @Test
    void testPostorderTraversal() {
        Problem_145 p = new Problem_145();

        p.postorderTraversalRec(Aux.getTree_5(), new ArrayList<>());
    }
}