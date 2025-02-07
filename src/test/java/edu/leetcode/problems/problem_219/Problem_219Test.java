package edu.leetcode.problems.problem_219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_219Test {

    @Test
    void containsNearbyDuplicate() {
        Problem_219 p = new Problem_219();
        assertTrue(p.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        assertFalse(p.containsNearbyDuplicate(new int[]{1, 2, 3}, 3));
        assertTrue(p.containsNearbyDuplicate(new int[]{99, 99}, 1));
        assertTrue(p.containsNearbyDuplicate(new int[]{99, 99}, 2));
    }
}