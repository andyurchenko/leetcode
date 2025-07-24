package edu.leetcode.problems.problem_345;

import java.util.Stack;

public class Problem_345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            if (isVowel(arr[leftIndex]) && isVowel(arr[rightIndex])) {
                char buff = arr[rightIndex];
                arr[rightIndex] = arr[leftIndex];
                arr[leftIndex] = buff;
                leftIndex++;
                rightIndex--;
            } else if (isVowel(arr[leftIndex])) {
                rightIndex--;
            } else if (isVowel(arr[rightIndex])) {
                leftIndex++;
            } else {
                leftIndex++;
                rightIndex--;
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels2(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] charList = new char[s.length()];
        final StringBuilder sb = new StringBuilder();
        final Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                charList[i] = '_';
                stack.push(c);
            } else {
                charList[i] = c;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (charList[i] == '_') {
                sb.append(stack.pop());
            } else {
                sb.append(charList[i]);
            }
        }

        return sb.toString();
    }
}
// eo -> oe
// bbabb
// abebob -> _b_b_b
// 'a', 'e', 'i', 'o', 'u'