package edu.leetcode.problems.problem_169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_169Test {

    @Test
    void majorityElement() {
        Problem_169 p = new Problem_169();
        assertEquals(3, p.majorityElement(new int[]{3,2,3}));
        assertEquals(3, p.majorityElement(new int[]{3, 3, 3, 2, 2, 1}));
        assertEquals(4, p.majorityElement(new int[]{4, 3, 2, 1, 4, 3, 2, 4, 3, 4}));
    }
}