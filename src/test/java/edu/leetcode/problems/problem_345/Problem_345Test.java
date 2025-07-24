package edu.leetcode.problems.problem_345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_345Test {

    @Test
    void reverseVowels() {
        final Problem_345 p = new Problem_345();
        assertEquals("leotcede", p.reverseVowels("leetcode"));
        assertEquals("IceCreAm", p.reverseVowels("AceCreIm"));
    }
}