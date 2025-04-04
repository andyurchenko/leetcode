package edu.leetcode.problems.problem_409;

public class Problem_409 {
    private int SIZE = 26;
    private int DELTA_LOWER = 97;
    private int DELTA_UPPER = 65;
    private int longestPalindrome = 0;
    private int biggestCounterForChar = 0;
    private int prevBiggestCounterForChar = 0;
    boolean flag = false;
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        if (s.length() == 2) {
            if (s.charAt(0) != s.charAt(1)) {
                return 1;
            } else {
                return 2;
            }

        }

        int[] lowers = new int[SIZE];
        int[] uppers = new int[SIZE];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (isLower(c)) {
                lowers[c - DELTA_LOWER]++;
            } else {
                uppers[c - DELTA_UPPER]++;
            }
        }

        for (int value : lowers) {
            if (value != 0) {
                if (value % 2 == 0) {
                    longestPalindrome += value;
                } else {
                    if (value > biggestCounterForChar) {
                        if (biggestCounterForChar > 1) {
                            longestPalindrome += --biggestCounterForChar;
                        }

                        biggestCounterForChar = value;
                    } else {
                        longestPalindrome += --value;
                    }
                }
            }
        }

        for (int value : uppers) {
            if (value != 0) {
                if (value % 2 == 0) {
                    longestPalindrome += value;
                } else {
                    if (value > biggestCounterForChar) {
                        if (biggestCounterForChar > 1) {
                            longestPalindrome += --biggestCounterForChar;
                        }
                        biggestCounterForChar = value;

                    } else {
                        longestPalindrome += --value;
                    }
                }
            }
        }

        return longestPalindrome + biggestCounterForChar ;
    }

    private boolean isLower(char c) {
        return 97 <= c && c <= 122;
    }
}
