package edu.leetcode.problems.problem_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_35Test {

    @Test
    void searchInsert() {
        Problem_35 problem35 = new Problem_35();
        assertEquals(2, problem35.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, problem35.searchInsert(new int[]{1, 3, 5, 6}, 2));
        assertEquals(4, problem35.searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(1, problem35.searchInsert(new int[]{1, 3, 5, 6}, 3));
        assertEquals(0, problem35.searchInsert(new int[]{}, 7));
        assertEquals(1, problem35.searchInsert(new int[]{1}, 7));
        assertEquals(0, problem35.searchInsert(new int[]{2, 3, 5, 6}, 1));
        assertEquals(0, problem35.searchInsert(new int[]{1}, 1));
        assertEquals(1, problem35.searchInsert(new int[]{1, 3}, 3));
    }
}