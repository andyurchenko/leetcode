package edu.leetcode.runner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainRunnerTest {

    @Test
    void getSqrtSumOfNumbers() {
        MainRunner m = new MainRunner();
        assertEquals(1, m.getSqrtSumOfNumbers(1));
        assertEquals(82, m.getSqrtSumOfNumbers(19));
        assertEquals(68, m.getSqrtSumOfNumbers(82));
        assertEquals(100, m.getSqrtSumOfNumbers(68));
        assertEquals(1, m.getSqrtSumOfNumbers(100));
    }

    @Test
    void getSqrtSumOfNumbersRec() {
        MainRunner m = new MainRunner();
        assertEquals(1, m.getSqrtSumOfNumbersRec(1));
        assertEquals(1, m.getSqrtSumOfNumbersRec(19));
        assertEquals(1, m.getSqrtSumOfNumbersRec(8));
    }
}