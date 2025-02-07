package edu.leetcode.problems.problem_205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_205Test {

    @Test
    void isIsomorphic() {
        Problem_205 p = new Problem_205();
        assertTrue(p.isIsomorphic("aca", "aba"));
        assertFalse(p.isIsomorphic("abacd", "abacc"));
        assertFalse(p.isIsomorphic("foo", "bar"));
        assertTrue(p.isIsomorphic("egg", "add"));
        assertTrue(p.isIsomorphic("paper", "title"));
        assertFalse(p.isIsomorphic("paper", "pappe"));

    }
}