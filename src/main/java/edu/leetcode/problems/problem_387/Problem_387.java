package edu.leetcode.problems.problem_387;

public class Problem_387 {
    public int firstUniqChar(String s) {
        int[] englishAlphabet = new int[26];
        char[] str = s.toCharArray();
        int currentIndex = -1;
        int prevIndex = -1;
        for (int i = str.length - 1; i >= 0; i--) {
            if (englishAlphabet[str[i] - 'a'] == 0) {
                currentIndex = i;
                prevIndex = i;
            } else {
                currentIndex = -1;
            }
            englishAlphabet[str[i] - 'a']++;
        }
        if (currentIndex == -1) {
            if (englishAlphabet[prevIndex] == 1) {
                return prevIndex;
            } else {
                return -1;
            }
        }

        return currentIndex;
    }

    public int firstUniqChar2(String s) {
        int[] letterCounter = new int[26];
        int sLength = s.length();

        for (int i = 0; i < sLength; i++){
            letterCounter[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sLength; i++){
            if (letterCounter[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
