package edu.leetcode.problems.problem_383;

import java.util.HashMap;
import java.util.Map;

public class Problem_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charsMagazine = magazine.toCharArray();
        for (char c : charsMagazine) {
            if (map.containsKey(c)) {
                Integer counter = map.get(c);
                map.replace(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        char[] charsRansomNote = ransomNote.toCharArray();
        for (char c : charsRansomNote) {
            if (map.containsKey(c)) {
                Integer counter = map.get(c);
                map.replace(c, --counter);
                if (counter < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int[] index = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, index[c - 'a']);
            if (i == -1) {
                return false;
            } else {
                index[c - 'a'] = i + 1;
            }
        }

        return true;
    }

    public boolean canConstruct3(String ransomNote, String magazine) {
        int[] counter = new int[26];
        for (char c : magazine.toCharArray()) {
            counter[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            counter[c - 'a']--;
            if (counter[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
