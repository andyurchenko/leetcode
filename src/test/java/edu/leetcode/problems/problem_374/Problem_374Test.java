package edu.leetcode.problems.problem_374;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_374Test {

    @Test
    void guessNumber() {
        Problem_374 p = new Problem_374(6);
        assertEquals(6, p.guessNumber(10));

        p = new Problem_374(8);
        assertEquals(8, p.guessNumber(10));

        p = new Problem_374(1);
        assertEquals(1, p.guessNumber(1));

        p = new Problem_374(1);
        assertEquals(1, p.guessNumber(2));

        p = new Problem_374(50);
        assertEquals(50, p.guessNumber(1000));

        p = new Problem_374(2147483647);
        assertEquals(2147483647, p.guessNumber(2147483647));
    }
}