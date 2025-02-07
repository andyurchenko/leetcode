package edu.leetcode.problems.problem_495;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_495Test {

    @Test
    void findPoisonedDuration() {
        Problem_495 p = new Problem_495();
        assertEquals(0, p.findPoisonedDuration(new int[]{}, 0));
        assertEquals(4, p.findPoisonedDuration(new int[]{1, 4}, 2));
        assertEquals(3, p.findPoisonedDuration(new int[]{1, 2}, 2));
        assertEquals(11, p.findPoisonedDuration(new int[]{1, 4, 7}, 5));
        assertEquals(11, p.findPoisonedDuration(new int[]{1, 2}, 10));
        assertEquals(4, p.findPoisonedDuration(new int[]{1, 2, 3}, 2));
    }
}