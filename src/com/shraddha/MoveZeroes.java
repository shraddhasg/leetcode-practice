package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        for (int a : nums) {
            if (a == 0) count++;
            else al.add(a);
        }
        for (int i = 0; i < al.size(); i++) nums[i] = al.get(i);

        for (int i = nums.length - count; i < nums.length; i++) nums[i] = 0;

        System.out.println("Array = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Input array = " + Arrays.toString(nums));
        moveZeroes(nums);
    }
}
