package edu.leetcode.problems.problem_367;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_367Test {

    @Test
    void isPerfectSquare() {
        Problem_367 p = new Problem_367();
        assertFalse(p.isPerfectSquare(5));
        assertFalse(p.isPerfectSquare(14));
        assertTrue(p.isPerfectSquare(7744));
        assertTrue(p.isPerfectSquare(9));
        assertTrue(p.isPerfectSquare(16));
        assertTrue(p.isPerfectSquare(25));
    }

    @Test
    void isPerfectSquare_2() {
        Problem_367 p = new Problem_367();
        assertTrue(p.isPerfectSquare(100));
        assertFalse(p.isPerfectSquare(200));
        assertFalse(p.isPerfectSquare(1000));
        assertTrue(p.isPerfectSquare(10000));

    }

    @Test
    void isPerfectSquare_3() {
        Problem_367 p = new Problem_367();
        assertTrue(p.isPerfectSquare(93025));

    }
}