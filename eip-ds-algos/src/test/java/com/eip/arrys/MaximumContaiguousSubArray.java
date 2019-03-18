package com.eip.arrys;

public class MaximumContaiguousSubArray {

    public static int maxConsecutiveSum(int[] inputArray) {

        int sum = 0;
        int maxSum = 0;
        if (inputArray == null) {
            return 0;
        } else {
            for (int i = 0; i < inputArray.length; i++) {
                sum = sum + inputArray[i];
                if (sum < 0) {
                    sum = 0;
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveSum(new int[] { -2, -3, 4, -1, -2, 1, 5, -3 }));
    }
}