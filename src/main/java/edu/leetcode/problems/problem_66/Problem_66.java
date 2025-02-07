package edu.leetcode.problems.problem_66;

public class Problem_66 {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) {
            return new int[] {1};
        }

        int acc = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            acc = digits[i] + acc;
            digits[i] = acc % 10;
            acc /= 10;
        }

        if (acc != 0) {
            int[] d = new int[digits.length + 1];
            d[0] = acc;
            System.arraycopy(digits, 0, d, 1, digits.length);

            return d;
        } else {
            return digits;
        }
    }
}
