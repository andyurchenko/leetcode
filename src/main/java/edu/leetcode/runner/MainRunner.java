package edu.leetcode.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Stack;

@Component
public class MainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("1 % 100 = " + 1 % 100);
        System.out.println(5 / 2);
    }

    public int getSqrtSumOfNumbers(int input) {
        int acc = 0;
        while (input != 0) {
            int e = input % 10;
            acc += e * e;
            input /= 10;
        }

        return acc;
    }

    public int getSqrtSumOfNumbersRec(int input) {
        if (input == 1) {
            return input;
        }

        int acc = 0;
        while (input != 0) {
            int e = input % 10;
            acc += e * e;
            input /= 10;
        }

        return getSqrtSumOfNumbersRec(acc);
    }

    public int rec(int value, int sum, int counter) {
        if (sum >= value) {
            return counter - 1;
        }
        sum += (int)Math.pow(26, counter) * 26;

        return rec(value, sum, ++counter);
    }
}
