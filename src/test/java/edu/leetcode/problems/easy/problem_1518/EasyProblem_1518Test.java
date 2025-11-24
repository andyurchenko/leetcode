package edu.leetcode.problems.easy.problem_1518;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyProblem_1518Test {

    @Test
    void numWaterBottles() {
        EasyProblem_1518 easyProblem1518 = new EasyProblem_1518();
        int res = easyProblem1518.numWaterBottles(5, 2);
        assertEquals(9, res);

        res = easyProblem1518.numWaterBottles(9, 3);
        assertEquals(13, res);
    }
}