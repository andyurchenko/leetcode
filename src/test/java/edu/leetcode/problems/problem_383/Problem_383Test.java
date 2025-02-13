package edu.leetcode.problems.problem_383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_383Test {

    @Test
    void canConstruct_0() {
        Problem_383 p = new Problem_383();
        assertTrue(p.canConstruct3("abc", "abc"));
    }

    @Test
    void canConstruct_1() {
        Problem_383 p = new Problem_383();
        assertFalse(p.canConstruct3("abbc", "aabcc"));
    }

    @Test
    void canConstruct_2() {
        Problem_383 p = new Problem_383();
        assertFalse(p.canConstruct3("abba", "abcbde"));
    }

    @Test
    void canConstruct_3() {
        Problem_383 p = new Problem_383();
        assertTrue(p.canConstruct3("abba", "abcbdea"));
    }
}