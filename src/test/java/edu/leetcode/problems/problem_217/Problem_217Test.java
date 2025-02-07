package edu.leetcode.problems.problem_217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_217Test {

    @Test
    void containsDuplicate() {
        Problem_217 p = new Problem_217();
        assertTrue(p.containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}