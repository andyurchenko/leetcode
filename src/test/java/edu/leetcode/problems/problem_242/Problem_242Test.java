package edu.leetcode.problems.problem_242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_242Test {

    @Test
    void isAnagram() {
        Problem_242 p = new Problem_242();
        assertTrue(p.isAnagram("abc", "cba"));
        assertFalse(p.isAnagram("aaa", "bbb"));
        assertFalse(p.isAnagram("aaa", "bb"));
        assertFalse(p.isAnagram("", "cba"));
        assertFalse(p.isAnagram("rat", "car"));
        assertTrue(p.isAnagram("", ""));
        assertTrue(p.isAnagram("abcd", "dcba"));
        assertTrue(p.isAnagram("anagram", "nagaram"));

    }
}