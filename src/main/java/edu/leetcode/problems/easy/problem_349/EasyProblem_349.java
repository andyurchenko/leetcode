package edu.leetcode.problems.easy.problem_349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EasyProblem_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] cashe = new int[1000];
        for (int i : nums1) {
            cashe[i] = 1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (cashe[i] == 1) {
                list.add(i);
                cashe[i] = 0;
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

}
