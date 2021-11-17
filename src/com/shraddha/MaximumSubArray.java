package com.shraddha;

import java.util.Arrays;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int including_prev = nums[0];
        int excluding_prev = 0;
        int excluding_curr = 0;
        for (int i = 1; i < nums.length; i++) {
            excluding_curr = Math.max(including_prev, excluding_prev);
            including_prev = excluding_prev + nums[i];
            excluding_prev = excluding_curr;
        }
        return Math.max(including_prev, excluding_prev);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input array = " + Arrays.toString(arr));
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum sum = " + maxSum);
    }
}
