package edu.leetcode.problems.problem_387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_387Test {

    @Test
    void firstUniqChar0() {
        Problem_387 p = new Problem_387();
        assertEquals(0, p.firstUniqChar("cababab"));
    }

    @Test
    void firstUniqChar1() {
        Problem_387 p = new Problem_387();
        assertEquals(-1, p.firstUniqChar("aabb"));
    }

    @Test
    void firstUniqChar2() {
        Problem_387 p = new Problem_387();
        assertEquals(0, p.firstUniqChar("leetcode"));
    }

    @Test
    void firstUniqChar3() {
        Problem_387 p = new Problem_387();
        assertEquals(2, p.firstUniqChar("loveleetcode"));
    }

    @Test
    void firstUniqChar4() {
        Problem_387 p = new Problem_387();
        assertEquals(8, p.firstUniqChar("dddccdbba"));
    }

    @Test
    void firstUniqChar5() {
        Problem_387 p = new Problem_387();
        assertEquals(0, p.firstUniqChar2("caddddddd"));
    }



}