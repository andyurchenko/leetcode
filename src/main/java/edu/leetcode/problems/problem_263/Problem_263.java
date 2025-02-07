package edu.leetcode.problems.problem_263;

public class Problem_263 {
    public boolean isUgly(int n) {
        if (n <= 0) { //edge case
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
