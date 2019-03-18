package com.eip.arrys;

import com.eip.arrays.BinarySearch;

public class BinarySearchClient {

    public static void main(String args[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[] { 1, 2, 3, 4, 5, 6 }, 6));
    }

    /* if (inputArray.length == 2) {
        if(inputArray[0] == value){
            return 0
        }
        if(inputArray[1] == value){
            return 1
        }
        else{
            return -1;
        }
        
    }
    int median = (int) Math.floor(inputArray.length / 2);

    int left = 0;
    int right = inputArray.length - 1;
    if (inputArray[median] == value) {
        return median;
    } else if (inputArray[median] < value) {
        left = median + 1;
        return binarySearch(Arrays.copyOfRange(inputArray, left, right), value);
    } else if (inputArray[median] > value) {
        right = median - 1;
        return binarySearch(Arrays.copyOfRange(inputArray, left, right), value);
    }

    return -1; */
}