package com.shraddha;

import java.util.Arrays;

public class JumpGameII {
    public static int check(int[] arr, int currentIndex) {
        int max = arr[currentIndex];
        int index = currentIndex;
        int element = max;
        while (element > 0) {
            if (currentIndex + element <= arr.length - 1) {
                if (max == arr[currentIndex + element]) {

                } else {
                    max = Math.max(max, arr[currentIndex + element]);
                    System.out.println("max = " + max);
                    if (max == arr[currentIndex + element]) index = currentIndex + element;
                }
            }
            System.out.println("Index = " + index);
            System.out.println("element = " + element);
            element--;
            System.out.println("element*** = " + element);
        }
        System.out.println(index);
        return index;
    }

    public static int jump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return 0;
        if (nums.length == 2) return 1;

        int numberOfJumps = 0;
        for (int i = 0; i < nums.length; ) {
            if (i + nums[i] >= nums.length - 1) return numberOfJumps + 1;
            i = check(nums, i);
            if (i == -1) return numberOfJumps;
            numberOfJumps++;
            System.out.println("number of jumps = " + numberOfJumps);
        }
        return numberOfJumps;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};
        System.out.println("Input array = " + Arrays.toString(numbers));
        int numberOfJumps = jump(numbers);
        System.out.println("Number of jumps = " + numberOfJumps);
    }
}
