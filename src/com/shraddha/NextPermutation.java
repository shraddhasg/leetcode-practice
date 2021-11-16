package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;

        if (nums.length == 2 && nums[0] <= nums[1]) {
            int c = nums[0];
            nums[0] = nums[1];
            nums[1] = c;
            return;
        }
        ArrayList<Integer> al = new ArrayList<>(nums.length - 1);
        int firstElement = nums[0];

        for (int i = 1; i < nums.length; i++) al.add(nums[i]);
        Collections.sort(al);


        if (firstElement <= al.get(al.size() - 1)) {
            al.sort(Collections.reverseOrder());
            for (int i = 0; i < al.size(); i++) nums[i + 1] = al.get(i);
        } else {
//            al.clear();
            Arrays.sort(nums);
//            for (int i = 0; i < al.size(); i++) nums[i + 1] = al.get(i);
        }

        System.out.println("Arraylist = " + al);
        System.out.println("Array = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println("Input array = " + Arrays.toString(arr));
        nextPermutation(arr);
    }
}
