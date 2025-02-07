package edu.leetcode.problems.problem_242;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Problem_242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int offset = 97;
        int[] alphabet = new int[26];
        byte[] sArr = s.getBytes();
        byte[] tArr = t.getBytes();
        for (int i = 0; i < s.length(); i++) {
            alphabet[sArr[i] - offset]++;
            alphabet[tArr[i] - offset]--;
        }

        for (int e : alphabet) {
            if (e != 0) {
                return false;
            }
        }

        return true;
    }
}
