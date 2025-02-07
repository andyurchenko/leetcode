package edu.leetcode.problems.problem_14;

public class Problem_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int shortestStringLength = strs[0].length();
        for (String s : strs) {
            if (s.length() < shortestStringLength) {
                shortestStringLength = s.length();
            }
        }

        if (shortestStringLength == 0) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < shortestStringLength; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
