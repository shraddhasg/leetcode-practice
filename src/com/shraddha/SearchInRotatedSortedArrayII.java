package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        for (int a : nums) al.add(a);
        return al.contains(target);
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;

        System.out.println("Input array = " + Arrays.toString(nums) + "\n" + "Target = " + target);
        boolean isAvailable = search(nums, target);
        System.out.println("Is target is available in array = " + isAvailable);
    }
}
