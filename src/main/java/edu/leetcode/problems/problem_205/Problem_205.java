package edu.leetcode.problems.problem_205;

import java.util.HashMap;
import java.util.Map;

public class Problem_205 {

    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }

            m1[s.charAt(i)]++;
            m2[t.charAt(i)]++;
//            m1[s.charAt(i)] = i + 1;
//            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }
    public boolean isIsomorphic2(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);

            Character c = map.get(s.charAt(i));
            if ( ! map.containsKey(sChar)) {
                if (map.containsValue(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
                continue;
            }

            if (c != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
