package edu.leetcode.problems.problem_171;

import java.util.HashMap;
import java.util.Map;

public class Problem_171 {
    public int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        char[] chars = columnTitle.toCharArray();
        for (int i = columnTitle.length() - 1, j = 0; i >= 0 && j < chars.length; i--, j++) {
            columnNumber += (int) (Math.pow(26, i) * (chars[j] - 64));
        }

        return columnNumber;
    }
}
