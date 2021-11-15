package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int a : nums) if (a != val) al.add(a);
        for (int i = 0; i < al.size(); i++) nums[i] = al.get(i);

        return al.size();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 2, 3};
        int val = 3;
        System.out.println("Input array = " + Arrays.toString(numbers) + "\n" + "Val = " + val);
        System.out.println("Length of array after removing given val = " + removeElement(numbers, val));
    }
}
