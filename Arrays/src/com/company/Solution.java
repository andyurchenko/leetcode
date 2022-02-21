package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMaxConsecutiveOnes2(int[] nums) {
        int maxNumberOfConsecutiveOnes = 0;
        int counterOfCurrentlyConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEqualToOne(nums[i])) {
                counterOfCurrentlyConsecutiveOnes++;
                maxNumberOfConsecutiveOnes = getGreaterValueOfTwo(maxNumberOfConsecutiveOnes, counterOfCurrentlyConsecutiveOnes);
            } else {
                counterOfCurrentlyConsecutiveOnes = 0;
            }
        }
        return maxNumberOfConsecutiveOnes;
    }

    boolean isEqualToOne(int element) {
        return (element == 1);
    }

    int getGreaterValueOfTwo(int maxNumber, int counter) {
        if (maxNumber < counter) {
            return counter;
        } else {
            return maxNumber;
        }
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int tempCount = 0, numOfOnes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                tempCount++;

                if (tempCount > numOfOnes) {
                    numOfOnes = tempCount;
                }
            } else {
                tempCount = 0;
            }
        }
        return numOfOnes;
    }

    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int number : nums) {
            if (doesNumberHasEvenDigits(number)) {
                counter++;
            }
        }
        return counter;
    }

    boolean doesNumberHasEvenDigits(int number) {
        int counter = 0;
        while ((number = number / 10) != 0) {
            counter++;
        }
        return !((counter % 2) == 0);
    }

    public int[] sortedSquares(int[] nums) {
        return sortArrayNonDecreasing(squareEachElementOfArray(nums));
    }

    int[] squareEachElementOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        return array;
    }


    int[] sortArrayNonDecreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i);
                for (int j = i - 1; j > 0; j--) {
                    if (array[j] < array[j - 1]) {
                        swap(array, j);
                    } else {
                        break;
                    }
                }
            }
        }
        return array;
    }

    void swap(int[] array, int i) {
        int tmp = array[i - 1];
        array[i - 1] = array[i];
        array[i] = tmp;
    }

    public void duplicateZeros2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
            }
        }
    }

    public void duplicateZeros(int[] arr) {
        int maxIndexInArray = arr.length - 1;
        int numberOfZeros = 0;
        int i;
        for (i = 0; i < arr.length - numberOfZeros; i++) {
            if (arr[i] == 0) {
                if (i == maxIndexInArray - numberOfZeros) {
                    arr[maxIndexInArray] = 0;
                    maxIndexInArray--;
                    break;
                }
                numberOfZeros++;
            }
        }
        for (i = maxIndexInArray; i - numberOfZeros >= 0; i--) {
            if (arr[i - numberOfZeros] != 0) {
                arr[i] = arr[i - numberOfZeros];
            } else {
                arr[i] = arr[i - numberOfZeros];
                arr[i - 1] = arr[i - numberOfZeros];
                i--;
                numberOfZeros--;
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
            shuffleSort(nums1, i);
        }
    }

    void shuffleSort(int[] arr1, int indexWhereToPutInArr1) {
        int tmp;
        for (int i = indexWhereToPutInArr1; i > 0; i--) {
            if (arr1[i] < arr1[i - 1]) {
                tmp = arr1[i - 1];
                arr1[i - 1] = arr1[i];
                arr1[i] = tmp;
            } else {
                break;
            }
        }
    }

    public int removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public boolean checkIfExist(int[] arr) {
        int doubledValue;
        float halfValue;
        for(int i = 0; i < arr.length - 1; i++) {
            doubledValue = arr[i] << 1;
            halfValue = (float)arr[i] / 2;
            for(int j = i + 1; j < arr.length; j++) {
                if(doubledValue == arr[j] || halfValue == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) {
            return false;
        }
        if(arr[0] >= arr[1]) {
            return false;
        }
        boolean differential = false;
        for(int i = 0; i < arr.length - 1; i++) {
            if(!differential && arr[i] > arr[i + 1] && i >= 1) {
                differential = true;
            }
            if((arr[i] < arr[i + 1] && differential) || (arr[i] == arr[i + 1])) {
                return false;
            }
        }
        if(!differential) {
            return false;
        }
        return true;
    }

    public int[] replaceElements(int[] arr) {
        int largestValue = arr[arr.length - 1];
        int tmp;
        for(int i = arr.length - 2; i >= 0; i--) {
            tmp = arr[i];
            arr[i] = largestValue;
            largestValue = Math.max(tmp, largestValue);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public void moveZeroes(int[] nums) {
        int counter = 0;
        int tmp;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                counter++;
            } else {
                tmp = nums[i - counter];
                nums[i - counter] = nums[i];
                nums[i] = tmp;
            }
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1) {
            return nums;
        }
        int tmp;
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        for(; leftPointer < rightPointer; leftPointer++) {
            if(isOdd(nums[leftPointer])) {
                for(; leftPointer < rightPointer; rightPointer--) {
                    if(isEven(nums[rightPointer])) {
                        tmp = nums[leftPointer];
                        nums[leftPointer] = nums[rightPointer];
                        nums[rightPointer] = tmp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    boolean isOdd(int number) {
        return (number % 2) == 1;
    }

    boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public int heightChecker(int[] heights) {
        if(heights.length <= 1) {
            return 0;
        }
        int[] heightsOrdered = shuffleSortArray(heights.clone());
        int mismatchCounter = 0;
        for(int i = 0; i < heightsOrdered.length; i++) {
            if (heights[i] != heightsOrdered[i]) {
                mismatchCounter++;
            }
        }
        return mismatchCounter;
    }
    int[] shuffleSortArray(int[] inArr) {
        int tmp;
        for(int i = 1; i < inArr.length; i++) {
            if(inArr[i] < inArr[i - 1]) {
                tmp = inArr[i];
                inArr[i] = inArr[i - 1];
                inArr[i - 1] = tmp;
                for(int j = i - 1; j > 0; j--) {
                    if(inArr[j] < inArr[j - 1]) {
                        tmp = inArr[j];
                        inArr[j] = inArr[j - 1];
                        inArr[j - 1] = tmp;
                    }
                }
            }
        }
        return inArr;
    }

    public int thirdMax2(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        } else if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int temp;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[i - 1]) {
                    temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    for(int j = i - 1; j > 0; j--) {
                        if(nums[j] < nums[j - 1]) {
                            temp = nums[j];
                            nums[j] = nums[j - 1];
                            nums[j - 1] = temp;
                        }
                    }
                }
            }
        }
        int counter = 1;
        int max = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] < max) {
                max = nums[i];
                counter++;
            }
            if(counter == 3) {
                return max;
            }
        }

        return nums[nums.length - 1];
    }
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            int min = nums[0];
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            int thirdMax = Integer.MIN_VALUE;
            for(int numberToCheck : nums) {
                if(numberToCheck > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = numberToCheck;
                } else if(secondMax < numberToCheck && numberToCheck < firstMax) {
                    thirdMax = secondMax;
                    secondMax = numberToCheck;
                } else if(thirdMax < numberToCheck && numberToCheck < secondMax) {
                    thirdMax = numberToCheck;
                }
                if(min > numberToCheck) {
                    min = numberToCheck;
                }
            }

            return (thirdMax != secondMax && min <= thirdMax) ? thirdMax : firstMax;
        }
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missedNumbers = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                missedNumbers.add(i + 1);
            }
        }

        return missedNumbers;
    }

    void shuffleSortArrayAscending(int[] inArray) {
        int temp;
        for(int i = 1; i < inArray.length; i++) {
            if(inArray[i] < inArray[i - 1]) {
                temp = inArray[i];
                inArray[i] = inArray[i - 1];
                inArray[i - 1] = temp;
                for(int j = i - 1; j > 0; j--) {
                    if(inArray[j] < inArray[j - 1]) {
                        temp = inArray[j];
                        inArray[j] = inArray[j - 1];
                        inArray[j - 1] = temp;
                    }
                }
            }
        }
    }

    boolean isNumberPresentIn(int numberToFind, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == numberToFind) {
                return true;
            }
        }
        return false;
    }
}
