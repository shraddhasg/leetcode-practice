package com.shraddha;

import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) if (nums[i] >= target) return i;
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 0;
        System.out.println("Input array = " + Arrays.toString(arr) + "\n" + "Target = " + target);
        int ans = searchInsert(arr, target);
        System.out.println("Index = " + ans);
    }
}
