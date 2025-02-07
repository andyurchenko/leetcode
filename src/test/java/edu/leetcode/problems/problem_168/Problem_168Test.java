package edu.leetcode.problems.problem_168;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_168Test {

    @Test
    void convertToTitle() {
        Problem_168 p = new Problem_168();
        assertEquals("A", p.convertToTitle(1));
        assertEquals("Z", p.convertToTitle(26));
        assertEquals("ZY", p.convertToTitle(701));
        assertEquals("AB", p.convertToTitle(28));
        assertEquals("YX", p.convertToTitle(674));
        assertEquals("AEF", p.convertToTitle(812));
        assertEquals("BA", p.convertToTitle(53));
        assertEquals("BZ", p.convertToTitle(78));
        assertEquals("AZ", p.convertToTitle(52));
        assertEquals("ZZZ", p.convertToTitle(18278));
        assertEquals("ZZY", p.convertToTitle(18277));

    }
}