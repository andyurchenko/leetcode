package edu.leetcode.problems.problem_125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_125Test {

    @Test
    void isPalindrome() {
        Problem_125 p = new Problem_125();
        assertTrue(p.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(p.isPalindrome(""));
        assertTrue(p.isPalindrome("!a@b#c!b@a"));
        assertTrue(p.isPalindrome("    "));
        assertFalse(p.isPalindrome("race a car"));

    }
}