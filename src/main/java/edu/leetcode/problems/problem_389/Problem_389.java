package edu.leetcode.problems.problem_389;

import java.util.HashSet;
import java.util.Set;

public class Problem_389 {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        int sSum = 0;
        for (char c : sChars) {
            sSum += c;
        }

        char[] tChars = t.toCharArray();
        int tSum = 0;
        for (char c : tChars) {
            tSum += c;
        }

        return (char)(tSum - sSum);
    }

    public char findTheDifference2(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sCounter = 0;
        int tCounter = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < tChars.length - 2; i++) {
            char currentChar = tChars[i];
            if (set.contains(currentChar)) {
                continue;
            }
            set.add(currentChar);
            for (char c : sChars) {
                if (c == currentChar) {
                    sCounter++;
                }
            }
            for (char c : tChars) {
                if (c == currentChar) {
                    tCounter++;
                }
            }
            if (sCounter != tCounter) {
                return currentChar;
            }
            sCounter = 0;
            tCounter = 0;
        }

        return tChars[tChars.length - 1];
    }
}
