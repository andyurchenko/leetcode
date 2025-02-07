package edu.leetcode.problems.problem_14;

import edu.leetcode.problems.problem_14.Problem_14;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_14Test {

    @Test
    void longestCommonPrefix() {
        Problem_14 problem14 = new Problem_14();
        assertEquals("", problem14.longestCommonPrefix(new String[]{""}));
        assertEquals("fl", problem14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        assertEquals("aa", problem14.longestCommonPrefix(new String[]{"aabbb","aaabbbb","aaaabbbb"}));
        assertEquals("", problem14.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        assertEquals("dog", problem14.longestCommonPrefix(new String[]{"dog"}));
    }
}