package edu.leetcode.problems.problem_108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_108Test {

    @Test
    void getSubArray() {
        Problem_108 p = new Problem_108();
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arrResult = p.getSubArray(0, 1, arr);
        assertEquals(2, arrResult.length);
        assertEquals(1, arrResult[0]);
        assertEquals(2, arrResult[1]);

        arrResult = p.getSubArray(3, 4, arr);
        assertEquals(2, arrResult.length);
        assertEquals(4, arrResult[0]);
        assertEquals(5, arrResult[1]);

        arrResult = p.getSubArray(0, 4, arr);
        assertEquals(5, arrResult.length);
        assertEquals(1, arrResult[0]);
        assertEquals(2, arrResult[1]);
        assertEquals(3, arrResult[2]);
        assertEquals(4, arrResult[3]);
        assertEquals(5, arrResult[4]);
    }

    @Test
    void sortedArrayToBST() {
    }

    @Test
    void sortedArrayToBSTRec() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final Problem_108 p = new Problem_108();
        p.sortedArrayToBSTRec(arr);
    }

    @Test
    void testGetSubArray() {
    }
}