package com.eip.arrays;

import java.util.Arrays;

public class BinarySearch {

    public int binarySearch(int[] inputArray, int value) {
        return binarySearchRec(inputArray, value, 0, inputArray.length - 1);
    }

    public int binarySearchRec(int[] inputArray, int value, int left, int right) {
        if (inputArray == null) {
            return -1;
        }

        int median = (int) (left + right) / 2;

        if (inputArray[median] == value) {
            return median;
        } else if (inputArray[median] > value) {
            right = median - 1;
            return binarySearchRec(inputArray, value, left, right);
        } else if (inputArray[median] < value) {
            left = median + 1;
            return binarySearchRec(inputArray, value, left, right);
        }
        return -1;
    }

}
