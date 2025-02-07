package edu.leetcode.problems.problem_202;

public class Problem_202 {
    public boolean isHappy(int n) {
        while (n != 4 && n != 1) {
            n = getSqrtSumOfNumbers(n);
        }

        return n == 1;
    }

    public int getSqrtSumOfNumbers(int input) {
        int acc = 0;
        while (input != 0) {
            int e = input % 10;
            acc += e * e;
            input /= 10;
        }

        return acc;
    }

    int getSqrtSumOfNumbersRec(int input) {
        if (input < 10) {
            return input;
        }

        int acc = 0;
        while (input != 0) {
            int e = input % 10;
            acc += e * e;
            input /= 10;
        }

        return getSqrtSumOfNumbersRec(acc);
    }
}
