package edu.leetcode.problems.easy.problem_1518;

public class EasyProblem_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunkBottlesCounter = numBottles;
        int numEmptyBottlesLeftAfterExchange = 0;
        while ((numBottles + numEmptyBottlesLeftAfterExchange) >= numExchange) {
            int numFullWatterBottlesAfterExchange = (numBottles + numEmptyBottlesLeftAfterExchange) / numExchange; // 5 / 2 = 2
            numEmptyBottlesLeftAfterExchange = (numBottles + numEmptyBottlesLeftAfterExchange) % numExchange; // 5 % 2 = 1
            totalDrunkBottlesCounter += numFullWatterBottlesAfterExchange;
            numBottles = numFullWatterBottlesAfterExchange;
        }

        return totalDrunkBottlesCounter;
    }
}