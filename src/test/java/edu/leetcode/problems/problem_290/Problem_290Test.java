package edu.leetcode.problems.problem_290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_290Test {

    @Test
    void wordPattern_0() {
        Problem_290 p = new Problem_290();
        assertTrue(p.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void wordPattern_1() {
        Problem_290 p = new Problem_290();
        assertFalse(p.wordPattern("abba", "dog cat cat"));
    }

    @Test
    void wordPattern_2() {
        Problem_290 p = new Problem_290();
        assertFalse(p.wordPattern("abba", "dog cat cat cat"));
    }

    @Test
    void wordPattern_3() {
        Problem_290 p = new Problem_290();
        assertFalse(p.wordPattern("abba", "dog cat mouse beaver"));
    }

    @Test
    void wordPattern_4() {
        Problem_290 p = new Problem_290();
        assertFalse(p.wordPattern("aaaa", "dog dog mouse beaver"));
    }

    @Test
    void wordPattern_5() {
        Problem_290 p = new Problem_290();
        assertFalse(p.wordPattern("abba", "dog dog dog dog"));
    }


}