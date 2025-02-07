package edu.leetcode.problems.problem_744;

public class Problem_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];
        for (char c : letters) {
            if (c > target) {
                return c;
            }
        }

        return result;
    }
}

//Input: letters = ["c", "c", "c", "f", "j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
