package edu.leetcode.problems.problem_290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem_290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        if (words.length != chars.length) {
            return false;
        }

        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(chars[i])) {
                if (!map.get(chars[i]).equals(words[i])) {
                    return false;
                }
            } else if (set.contains(words[i])) {
                return false;
            } else {
                map.put(chars[i], words[i]);
                set.add(words[i]);
            }
        }

        return true;
    }
}
