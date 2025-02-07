package edu.leetcode.problems.problem_67;

import java.util.Arrays;

public class Problem_67 {
    public String addBinary(String a, String b) {
        char[] termFirst;
        char[] termSecond;
        if (a.length() >= b.length()) {
            termFirst = a.toCharArray();
            termSecond = new char[termFirst.length];
            Arrays.fill(termSecond, '0');
            System.arraycopy(b.toCharArray(), 0, termSecond, a.length() - b.length(), b.length());
        } else {
            termFirst = b.toCharArray();
            termSecond = new char[termFirst.length];
            Arrays.fill(termSecond, '0');
            System.arraycopy(a.toCharArray(), 0, termSecond, b.length() - a.length(), a.length());
        }
        char[] sum = new char[termFirst.length];

        int acc = 0;
        for (int i = termFirst.length - 1; i >= 0; i--) {
            int t1 = termFirst[i] % 48;
            int t2 = termSecond[i] % 48;
            acc = t1 + t2 + acc;
            sum[i] = (char) (acc % 2 + 48);
            acc = acc / 2;
        }

        StringBuilder sb = new StringBuilder();
        if (acc != 0) {
            sb.append(acc);
        }

        for (char c : sum) {
            sb.append(c);
        }

        return sb.toString();
    }
}
