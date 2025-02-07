package edu.leetcode.problems.problem_492;

public class Problem_492 {
    public int[] constructRectangle(int area) {
//       return [L, W] | L >= W
        int W;
        for (W = (int) Math.sqrt(area); W > 0; W--) {
            if (area % W == 0) {
                break;
            }
        }

        return new int[]{area / W, W};
    }
}
