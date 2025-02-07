package edu.leetcode.problems.problem_28;

public class Problem_28 {
    public int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty()) {
            return -1;
        }
        char[] sourceString = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        int i, j, k;
        for (i = 0; i < sourceString.length; i++) {
            for (j = 0, k = i; j < pattern.length && k < sourceString.length; j++, k++) {
                if (sourceString[k] != pattern[j]) {
                    break;
                }
            }

            if (j == pattern.length) {
                return i;
            }
        }

        return -1;
    }
    public int strStr2(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty()) {
            return -1;
        }
        char[] sourceString = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        int indexInPattern = 0;
        int firstAppearancePosition = -1;
        for (int i = 0; i < sourceString.length; i++) {
            if (sourceString[i] == pattern[indexInPattern] && indexInPattern == 0) {
                firstAppearancePosition = i;
            }

            if (sourceString[i] == pattern[indexInPattern]) {
                indexInPattern++;
            } else {
                indexInPattern = 0;
            }

            if (indexInPattern == pattern.length) {
                return firstAppearancePosition;
            }

        }

        return -1;
    }
}
