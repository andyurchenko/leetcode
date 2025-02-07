package edu.leetcode.problems.problem_263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_263Test {

    @Test
    void isUgly() {
//        An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
        Problem_263 p = new Problem_263();
        assertTrue(p.isUgly(2));
        assertTrue(p.isUgly(3));
        assertTrue(p.isUgly(5));
        assertFalse(p.isUgly(7));
        assertTrue(p.isUgly(1));
        assertFalse(p.isUgly(14));
    }
}