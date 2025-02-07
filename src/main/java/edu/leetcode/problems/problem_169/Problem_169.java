package edu.leetcode.problems.problem_169;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Problem_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            Integer counter = map.get(n);
            if (counter == null) {
                map.put(n, 1);
            } else {
                map.put(n, ++counter);
            }
        }
        int majElement = 0;
        int maxCounter = 0;
        for (int n : nums) {
            Integer counter = map.get(n);
            if (counter > maxCounter) {
                majElement = n;
                maxCounter = counter;
            }
        }


        return majElement;
    }
}
