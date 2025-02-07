package edu.leetcode.problems.problem_190;

public class Problem_190 {
    public int reverseBits(int n) {
        int LSB;
        int reversed = 0;
        for (int i = 0, j = 31; i < 32; i++, j--) {
            LSB = n & 0b1;
            n = n >> 1;

            reversed += intPow(2, j) * LSB;
        }
        return reversed;
    }

    int intPow(int a, int b) {
        return intPowerTail(a, b, 1);
    }

    int intPowerTail(int a, int powCounter, int acc) {
        if (powCounter == 0) {
            return acc;
        } else {
            return intPowerTail(a, powCounter - 1, a * acc);
        }
    }
}
