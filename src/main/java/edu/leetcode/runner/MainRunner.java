package edu.leetcode.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Stack;

@Component
public class MainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("1 % 100 = " + 1 % 100);
//        int a = 'A';
//        System.out.println("Char A = " + a);
//        System.out.println("Char A - 64 = " + ('A' - 64));
//        System.out.println("Char 25 + 64 = " + (char)(25 + 64));
//        int BASE = 26;
//        int value = 3;
//        System.out.println(rec(703, 0, 0));
        int input = 19;

        Stack<Integer> stack = new Stack<>();
        while (input != 0) {
            stack.push(input % 10);

            input /= 10;
        }
        int acc = 0;
        for (Integer e : stack) {
            acc += e * e;
        }

        System.out.println("Finished");
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
