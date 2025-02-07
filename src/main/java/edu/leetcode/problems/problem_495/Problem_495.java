package edu.leetcode.problems.problem_495;

public class Problem_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int counter = 0;
        if (timeSeries.length == 0) {
            return counter;
        }

        if (timeSeries.length == 1) {
            return duration;
        }

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int d = timeSeries[i + 1] - timeSeries[i];
            if (d >= duration) {
                counter += duration;
            } else {
                counter += d;
            }
        }
        counter += duration;

        return counter;
    }
}
