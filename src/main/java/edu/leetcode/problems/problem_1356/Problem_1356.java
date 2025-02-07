package edu.leetcode.problems.problem_1356;

public class Problem_1356 {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int leftBitCounter = Integer.bitCount(arr[j]);
                int rightBitCounter = Integer.bitCount(arr[j + 1]);
                if (leftBitCounter > rightBitCounter) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

                if (leftBitCounter == rightBitCounter) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    public int[] sortByBits2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int buffLeft = arr[j];
                int leftOneCount = 0;
                while (buffLeft != 0) {
                    if ((buffLeft & 0x1) == 1) {
                        leftOneCount++;
                    }
                    buffLeft = buffLeft >>> 1;
                }

                int buffRight = arr[j + 1];
                int rightOneCount = 0;
                while (buffRight != 0) {
                    if ((buffRight & 0x1) == 1) {
                        rightOneCount++;
                    }
                    buffRight = buffRight >>> 1;
                }

                if (leftOneCount > rightOneCount) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

                if (leftOneCount == rightOneCount) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }
}
