package edu.leetcode.problems.problem_258;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_258Test {

    @Test
    void addDigits() {
        Problem_258 p = new Problem_258();
        assertEquals(3, p.addDigits(138));
        assertEquals(5, p.addDigits(5));
        assertEquals(3, p.addDigits(111));
    }
}