package edu.leetcode.problems.problem_168;

import java.util.HashMap;
import java.util.Map;

public class Problem_168 {
    public String convertToTitle(int columnNumber) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            map.put(i, (char) (64 + i));
        }

        int BASE = 26;
        int counter = rec(columnNumber, 0, 0);

        //do it via recursive function
//        while (columnNumber > (Math.pow(BASE, counter))*BASE + BASE*counter) {
//            counter++;
//        }

        StringBuilder sb = new StringBuilder();
        while (counter > 0) {
//            int t = (int) Math.pow(BASE, counter) + BASE * counter;
            int t = (int) Math.pow(BASE, counter);
            if (columnNumber % 26 == 0) {
                columnNumber -= (int) Math.pow(BASE, counter) - 1;
                sb.append(map.get(columnNumber / t));
                columnNumber = columnNumber % t;
                columnNumber++;
            } else {
                //            sb.append((char)(64 + (--columnNumber / t)));
                sb.append(map.get(columnNumber / t));
                columnNumber = columnNumber % t;
            }

            counter--;
        }
//        sb.append((char)(64 + columnNumber));
        sb.append(map.get(columnNumber));

        return sb.toString();
    }

    public int rec(int value, int sum, int counter) {
        if (sum >= value) {
            return counter - 1;
        }
        sum += (int) (Math.pow(26, counter) * 26);

        return rec(value, sum, ++counter);
    }
}
