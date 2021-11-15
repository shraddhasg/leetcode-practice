package com.shraddha;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
            } else al.add(nums[i]);
        }
        for (int i = 0; i < al.size(); i++) nums[i] = al.get(i);

        System.out.println(Arrays.toString(nums));
        return al.size();
    }

    public static void main(String[] args) {
        int[] number = {1, 1, 2};
        System.out.println("Input Array = " + Arrays.toString(number));
        int length = removeDuplicates(number);
        System.out.println("Length after removing duplicates = " + length);
    }
}
