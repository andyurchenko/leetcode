package edu.leetcode.problems.problem_219;

import java.util.HashMap;
import java.util.Map;

public class Problem_219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (i - index <= k) {
                    return true;
                }
                map.put(nums[i], i);
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k && i + j < nums.length; j++) {
                if (nums[i] == nums[i + j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
//0 1 2 3 4 5 6 7 8 9
//1 2 3 4 1 4 3 5 2 2