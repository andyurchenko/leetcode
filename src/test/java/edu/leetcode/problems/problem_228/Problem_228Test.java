package edu.leetcode.problems.problem_228;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_228Test {

    @Test
    void summaryRanges() {
        Problem_228 p = new Problem_228();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("0->2");
        expectedResult.add("4->5");
        expectedResult.add("7");
        int[] nums = new int[]{0,2,3,4,6,8,9};
        List<String> result = p.summaryRanges(nums);
        for (int i = 0; i < result.size(); i++) {
            assertEquals(expectedResult.get(i), result.get(i));
        }

    }
}