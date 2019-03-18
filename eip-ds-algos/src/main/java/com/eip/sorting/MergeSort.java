package com.eip.sorting;

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] array) {

        int length = array.length;
        if (length < 2) {
            return array;
        } else {
            int median = (int) Math.floor(length / 2);
            int[] leftAarry = Arrays.copyOfRange(array, 0, median);
            int[] rightArray = Arrays.copyOfRange(array, median, length);
            return merge(sort(leftAarry), sort(rightArray));
        }
    }

    private int[] merge(int[] left, int[] right) {
        int lLeft = left.length;
        int lRight = right.length;
        int[] result = new int[lLeft + lRight];
        int i = 0, j = 0, nextIndex = 0;
        while (i < lLeft && j < lRight) {
            if (left[i] < right[j]) {
                result[nextIndex++] = left[i++];
            } else {
                result[nextIndex++] = right[j++];
            }
        }

        while (i < lLeft) {
            result[nextIndex++] = left[i++];
        }

        while (j < lRight) {
            result[nextIndex++] = right[j++];
        }

        return result;
    }

}