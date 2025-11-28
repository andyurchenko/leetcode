package edu.leetcode.problems.easy.problem_121;

public class EasyProblem_121 {
    public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] >= minCost) {
                continue;
            }
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > maxProfit) {
                    minCost = prices[i];
                    maxProfit = diff;
                }
            }
        }

        if (maxProfit > 0) {
            return maxProfit;
        } else {
            return 0;
        }
    }
}
