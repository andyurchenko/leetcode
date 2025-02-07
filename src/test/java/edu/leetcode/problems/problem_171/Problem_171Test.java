package edu.leetcode.problems.problem_171;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_171Test {

    @Test
    void titleToNumber() {
        Problem_171 p = new Problem_171();
        assertEquals(1, p.titleToNumber("A"));
        assertEquals(28, p.titleToNumber("AB"));
        assertEquals(701, p.titleToNumber("ZY"));
    }
}