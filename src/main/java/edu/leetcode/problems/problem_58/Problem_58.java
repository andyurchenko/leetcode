package edu.leetcode.problems.problem_58;

public class Problem_58 {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                counter++;
            }
            else {
                return counter;
            }
        }

        return counter;
    }
}
