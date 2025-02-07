package edu.leetcode.problems.problem_28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_28Test {

    @Test
    void strStr() {
        Problem_28 problem28 = new Problem_28();
//        assertEquals(-1, problem28.strStr("", "sad"));
//        assertEquals(-1, problem28.strStr("qqqqqq", ""));
        assertEquals(0, problem28.strStr("sadqqqq", "sad"));
        assertEquals(4, problem28.strStr("0123sad789", "sad"));
        assertEquals(4, problem28.strStr("0123sad", "sad"));
        assertEquals(0, problem28.strStr("sad", "sad"));
        assertEquals(-1, problem28.strStr("sa3", "sad"));
        assertEquals(0, problem28.strStr("s", "s"));
        assertEquals(4, problem28.strStr("mississippi", "issip"));

    }
}