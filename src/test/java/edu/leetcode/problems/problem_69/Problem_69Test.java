package edu.leetcode.problems.problem_69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_69Test {

    @Test
    void mySqrt() {
        Problem_69 problem69 = new Problem_69();
        assertEquals(1, problem69.mySqrt(2));
        assertEquals(2, problem69.mySqrt(4));
        assertEquals(1, problem69.mySqrt(1));
        assertEquals(3, problem69.mySqrt(9));
        assertEquals(2, problem69.mySqrt(8));
        assertEquals(2, problem69.mySqrt(7));
        assertEquals(3, problem69.mySqrt(10));
        assertEquals(4, problem69.mySqrt(16));
        assertEquals(0, problem69.mySqrt(0));
        assertEquals(46340, problem69.mySqrt(2147395600));
        assertEquals(46340, problem69.mySqrt(2147483647));

//        2147483647
//        2147488281
//        2147483647
//        assertEquals(46340, problem69.mySqrt(2147395600));
//        2147483647
//        2147395600
//        Integer.MAX_VALUE = 2147483647
    }
}