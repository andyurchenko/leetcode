package edu.leetcode.problems.problem_58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_58Test {

    @Test
    void lengthOfLastWord() {
        Problem_58 problem58 = new Problem_58();

        assertEquals(5, problem58.lengthOfLastWord("12345"));
        assertEquals(5, problem58.lengthOfLastWord(" 12345 "));
        assertEquals(3, problem58.lengthOfLastWord("12345 123"));
        assertEquals(1, problem58.lengthOfLastWord("12345 123 1"));
        assertEquals(3, problem58.lengthOfLastWord("12345 123    1    123"));
    }
}