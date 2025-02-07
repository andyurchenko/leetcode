package edu.leetcode.problems.problem_125;

public class Problem_125 {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int leftIndex = 0;
        int rightIndex = s.length() - 1;
        while (leftIndex < rightIndex) {
            char leftChar = s.charAt(leftIndex);
            if (
                (leftChar < '0' || '9' < leftChar)
                && (leftChar < 'a' || 'z' < leftChar)
                && (leftChar < 'A' || 'Z' < leftChar)
            ) {
                leftIndex++;
                continue;
            }

            char rightChar = s.charAt(rightIndex);
            if (
                (rightChar < '0' || '9' < rightChar)
                && (rightChar < 'a' || 'z' < rightChar)
                && (rightChar < 'A' || 'Z' < rightChar)
            ) {
                rightIndex--;
                continue;
            }

            if ('A' <= leftChar && leftChar <= 'Z') {
                leftChar = (char)(leftChar + 32);
            }

            if ('A' <= rightChar && rightChar <= 'Z') {
                rightChar = (char)(rightChar + 32);
            }

            if (leftChar != rightChar) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }

        return true;
    }
    //            char leftChar = s.charAt(leftIndex);
//            if (
//                !(
//                    ('0' <= leftChar && leftChar <= '9')
//                    || ('A' <= leftChar && leftChar <= 'Z')
//                    || ('a' <= leftChar && leftChar <= 'z')
//                )
//            ) {
//                leftIndex++;
//                continue;
//            }

    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((48 <= c && c <= 57) || (97 <= c && c <= 122)) {
                sb.append(c);
            }
        }

        if (sb.isEmpty()) {
            return true;
        }

        for (int i = 0, j = sb.length() - 1; i < sb.length() / 2; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
