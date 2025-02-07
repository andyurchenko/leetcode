package edu.leetcode.problems.problem_67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_67Test {

    @Test
    void addBinary() {
        Problem_67 problem67 = new Problem_67();
        assertEquals("1011", problem67.addBinary("1001", "10"));
        assertEquals("1101", problem67.addBinary("1011", "10"));
        assertEquals("1", problem67.addBinary("1", "0"));
        assertEquals("0", problem67.addBinary("0", "0"));
        assertEquals("10", problem67.addBinary("1", "1"));
        assertEquals("10000", problem67.addBinary("1111", "1"));
//        System.out.println(problem67.addBinary("1001", "11"));
    }
}