package edu.leetcode.problems.problem_191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_191Test {

    @Test
    void hammingWeight() {
        Problem_191 problem191 = new Problem_191();
        assertEquals(3, problem191.hammingWeight(11));
    }
}