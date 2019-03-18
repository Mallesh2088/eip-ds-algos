package com.eip.sorting;

import java.util.Arrays;

public class MergeSortClient {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] result = mergeSort.sort(new int[] { 1, 3, 4, 6, 2, 8 });
        Arrays.stream(result).forEach(System.out::println);
    }
}