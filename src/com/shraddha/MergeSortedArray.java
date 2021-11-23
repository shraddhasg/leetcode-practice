package com.shraddha;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int i = 0; i < nums1.length && count < n; i++) {
            if (nums1[i] == 0) {
                nums1[i] = nums2[count];
                count++;
            }
        }
        Arrays.sort(nums1);
        System.out.println("Num1 = " + Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] num2 = {2, 5, 6};
        int n = 3;
        System.out.println("Num1[] = " + Arrays.toString(num1) + "\n" + "M = " + m + "\n" + "Num2[] = " + Arrays.toString(num2) + "\n" + "N = " + n);
        merge(num1, m, num2, n);
    }
}
