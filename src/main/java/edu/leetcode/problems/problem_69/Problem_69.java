package edu.leetcode.problems.problem_69;

import java.math.BigInteger;

public class Problem_69 {
    public int mySqrt(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        int i = 0;
        long p;
        while (i < x) {
            p = i * i;
            if (p == x) {
                break;
            }
            if (p > x || p < 0) {
                i -= 1;
                break;
            }
            i++;
        }

        return i;
    }
}
