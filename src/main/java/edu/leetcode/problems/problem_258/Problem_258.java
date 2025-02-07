package edu.leetcode.problems.problem_258;

public class Problem_258 {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num / 10 != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum + num;
        }

        return num;
    }
}
