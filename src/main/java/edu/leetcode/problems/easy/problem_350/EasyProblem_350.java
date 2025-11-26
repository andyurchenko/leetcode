package edu.leetcode.problems.easy.problem_350;

import java.util.ArrayList;
import java.util.List;

public class EasyProblem_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] cashe = new int[1001];
        for (int i : nums1) {
            cashe[i]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (cashe[i] > 0) {
                list.add(i);
                cashe[i]--;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
