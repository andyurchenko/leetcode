package edu.leetcode.problems.easy.problem_121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblem_121Test {

    @Test
    void maxProfit() {
        final EasyProblem_121 easyProblem121 = new EasyProblem_121();
        easyProblem121.maxProfit(new int[]{7,1,5,3,6,4});
        assertEquals(0, easyProblem121.maxProfit(new int[]{2, 1}));
    }
}