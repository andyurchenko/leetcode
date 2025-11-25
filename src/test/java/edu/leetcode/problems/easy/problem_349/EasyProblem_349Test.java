package edu.leetcode.problems.easy.problem_349;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblem_349Test {

    @Test
    void intersection() {
        EasyProblem_349 easyProblem349 = new EasyProblem_349();
        int[] res = easyProblem349.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        assertEquals(1, res.length);
        assertEquals(2, res[0]);

        res = easyProblem349.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        assertEquals(2, res.length);
        assertEquals(4, res[0]);
        assertEquals(9, res[1]);
    }
}