package edu.leetcode.problems.problem_724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_724Test {

    @Test
    void pivotIndex() {
        Problem_724 p = new Problem_724();
        assertEquals(3, p.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}