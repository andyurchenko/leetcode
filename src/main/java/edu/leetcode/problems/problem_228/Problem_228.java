package edu.leetcode.problems.problem_228;

import java.util.ArrayList;
import java.util.List;

public class Problem_228 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) { //edge case
            return new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int firstElement = nums[0];
        int previousElement = nums[0];
        int i = 1;
        for (; i < nums.length; i++) {
            if (nums[i] - previousElement != 1) {
                if (previousElement == firstElement) {
                    list.add(String.valueOf(firstElement));
                } else {
                    sb.append(firstElement);
                    sb.append("->");
                    sb.append(previousElement);
                    list.add(sb.toString());
                    sb.setLength(0);
                }
                firstElement = nums[i];
            }
            previousElement = nums[i];
        }

        if (previousElement == firstElement) {
            list.add(String.valueOf(firstElement));
        } else {
            sb.append(firstElement);
            sb.append("->");
            sb.append(previousElement);
            list.add(sb.toString());
            list.add(firstElement + "->" + previousElement);
        }

        return list;
    }

    public List<String> summaryRanges2(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }

        int lastNum = nums[0];
        int startIndex = 0;
        int i;
        for (i = 1 ; i < nums.length; i++ )
        {
            if (nums[i] == lastNum + 1) {
                lastNum++;
            } else {
                StringBuilder s = new StringBuilder();
                s.append(nums[startIndex]);
                if(i-1 != startIndex) {
                    s.append('-');
                    s.append('>');
                    s.append(nums[i-1]);
                }
                ans.add(s.toString());
                startIndex= i;
                lastNum = nums[i];
            }
        }
        StringBuilder s = new StringBuilder();
        s.append(nums[startIndex]);
        if (i - 1 != startIndex) {
            s.append('-');
            s.append('>');
            s.append(nums[i-1]);
        }
        ans.add(s.toString());

        return ans;
    }
}
