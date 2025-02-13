package edu.leetcode.problems.problem_389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_389Test {

    @Test
    void findTheDifference2_0() {
        Problem_389 p = new Problem_389();
        assertEquals('e', p.findTheDifference2("abcd", "abcde"));
    }

    @Test
    void findTheDifference2_1() {
        Problem_389 p = new Problem_389();
        assertEquals('e', p.findTheDifference2("abcd", "abecd"));
    }

    @Test
    void findTheDifference2_2() {
        Problem_389 p = new Problem_389();
        assertEquals('e', p.findTheDifference2("aabcd", "aaebcd"));
    }

    @Test
    void findTheDifference2_3() {
        Problem_389 p = new Problem_389();
        assertEquals('a', p.findTheDifference2("aab", "aaab"));
    }
}