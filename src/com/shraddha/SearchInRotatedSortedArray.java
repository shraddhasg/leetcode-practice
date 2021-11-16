package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static String grtStringFromArray(int[] arr) {
        String str = "";
        for (int a : arr) str += a + "";
        return str;
    }

    public static int search(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        for (int a : nums) al.add(a);

        System.out.println("Arraylist = " + al);
        return al.indexOf(target);
//        String str = grtStringFromArray(nums);
//        return str.indexOf(target + "");
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Input array = " + Arrays.toString(arr) + "\n" + "Target = " + target);
        int ans = search(arr, target);
        System.out.println("Index = " + ans);
    }
}
