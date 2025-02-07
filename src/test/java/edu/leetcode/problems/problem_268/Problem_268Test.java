package edu.leetcode.problems.problem_268;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_268Test {

    @Test
    void missingNumber() {
        Problem_268 p = new Problem_268();
        assertEquals(2, p.missingNumber(new int[]{3, 0, 1}));
    }
}