package edu.leetcode.problems.problem_278;

public class Problem_278 {
    public int firstBadVersion(int n) {
        return firstBadVersionRec(n, 0);
    }

    public int firstBadVersion2(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + ((right - left) / 2) ;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    public int firstBadVersionRec(int currentN, int previousN) {
        if (isBadVersion(currentN)) {
            if (!isBadVersion(currentN - 1)) {
                return currentN;
            }

            return firstBadVersionRec(currentN >>> 1, currentN);

        } else { // if N-version is a good one
            if (isBadVersion(currentN + 1)) {
                return currentN + 1;
            }

            return firstBadVersionRec(
                    currentN + ((previousN - currentN) >>> 1),
                    previousN);
        }
    }
    public int firstBadVersionRec2(int currentN, int previousN) {
        if (isBadVersion(currentN)) {
            if (!isBadVersion(currentN - 1)) {
                return currentN;
            }


            return firstBadVersionRec(currentN >>> 1, currentN);

        } else { // if N-version is a good one
            if (isBadVersion(currentN + 1)) {
                return currentN + 1;
            }

            return firstBadVersionRec(
                    currentN + ((previousN - currentN) >>> 1),
                    previousN);
        }
    }

    boolean isBadVersion(int version) {
//        return version >= 1702766719;
        return version >= 8;
    }
}
