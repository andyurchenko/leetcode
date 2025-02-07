package edu.leetcode.problems.problem_66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_66Test {

    @Test
    void plusOne() {
        Problem_66 problem66 = new Problem_66();
        assertArrayEquals(new int[]{1}, problem66.plusOne(new int[]{}));
        assertArrayEquals(new int[]{3}, problem66.plusOne(new int[]{2}));
        assertArrayEquals(new int[]{1, 0}, problem66.plusOne(new int[]{9}));
        assertArrayEquals(new int[]{1, 2, 4}, problem66.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 0}, problem66.plusOne(new int[]{1, 2, 2, 9}));
        assertArrayEquals(new int[]{1, 0}, problem66.plusOne(new int[]{9}));
    }
}