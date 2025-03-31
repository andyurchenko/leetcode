package edu.leetcode.problems.problem_367;

import java.util.Stack;

public class Problem_367 {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0) {
            return true;
        }

        int acc = num;
        int counter = 0;
        while (acc % 10 == 0) {
            acc /= 10;
            counter++;
        }
        if (counter % 2 == 0 && acc == 1) {
            return true;
        }

        int answer = 0;
        int currentPair = 0;
        int nextAdditionToAnswer;
        int multiplicand = 0;
        boolean flag = false;
        Stack<Integer> stack = getPairs(num);
        while (!stack.empty()) {
            currentPair *= 100;
            currentPair += stack.pop();

            answer *= 10;
            multiplicand = (answer * 2) + 0;
            nextAdditionToAnswer = 0;
            while (currentPair >= multiplicand * nextAdditionToAnswer) {
                multiplicand++;
                nextAdditionToAnswer++;
                flag = true;
            }

            if (flag) {
                flag = false;
                multiplicand--;
                nextAdditionToAnswer--;
            }

            answer += nextAdditionToAnswer;
            currentPair -= (multiplicand * nextAdditionToAnswer);

        }

        return currentPair == 0;
    }

    private Stack<Integer> getPairs(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 100);
            num /= 100;
        }

        return stack;
    }
}
