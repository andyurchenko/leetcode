package edu.leetcode.problems.problem_344;

public class Problem_344 {
    public void reverseString(char[] s) {
        char buffer;
        for (int left = 0, right = s.length - 1; left < (s.length / 2); left++, right--) {
            buffer = s[left];
            s[left] = s[right];
            s[right] = buffer;
        }
        for (char c : s) {
            System.out.print(c);
        }
    }

}

