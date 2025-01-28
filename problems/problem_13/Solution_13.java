package problems.problem_13;

import java.util.HashMap;
import java.util.Map;
import java.util.PrimitiveIterator;

public class Solution_13 {
    public int romanToInt(String s) {
        int sum = 0;
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

//        MCMXCIV
        for (int i = s.length() - 2; i >= 0; i--)
        {
            int val1 = roman.get(s.substring(i, i + 1));
            int val2 = roman.get(s.substring(i + 1, i + 2));
            if (val1 < val2)
            {
                sum += val2 - (2 * val1);
            }
            else
            {
                sum += val2;
            }
        }
        sum += roman.get(s.substring(0, 1));
        return sum;
    }
    public int romanToInt2(String s) {
        Map<String, Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);
        romans.put("IV", 4);
        romans.put("IX", 9);
        romans.put("XL", 40);
        romans.put("XC", 90);
        romans.put("CD", 400);
        romans.put("CM", 900);
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        int sum = 0;
        int addedBefore = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!stringBuilder.isEmpty() && ((chars[i] == 'V' || chars[i] == 'X' || chars[i] == 'L' || chars[i] == 'C' || chars[i] == 'D' || chars[i] == 'M'))) {
                stringBuilder.append(chars[i]);
                if (romans.containsKey(stringBuilder.toString())) {
                    sum -= addedBefore;
                    sum += romans.get(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    continue;
                }
                stringBuilder.setLength(0);
            } else {
                stringBuilder.setLength(0);
            }

            if ((chars[i] == 'I' || chars[i] == 'X' || chars[i] == 'C') && i + 1 < chars.length) {
                addedBefore = romans.get(String.valueOf(chars[i]));
                sum += addedBefore;
                stringBuilder.append(chars[i]);
            } else {
                sum += romans.get(String.valueOf(chars[i]));
            }

        }

        return sum;
    }
}
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
