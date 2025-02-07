package edu.leetcode.problems.problem_231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_231Test {

    @Test
    void isPowerOfTwo() {
        Problem_231 p = new Problem_231();
        assertTrue(p.isPowerOfTwo(4));
        assertFalse(p.isPowerOfTwo(3));
        assertTrue(p.isPowerOfTwo(16));
        assertFalse(p.isPowerOfTwo(2147483647));
        assertFalse(p.isPowerOfTwo(-2147483648));


    }
}