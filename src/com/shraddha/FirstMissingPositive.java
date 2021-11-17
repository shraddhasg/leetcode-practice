package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        for (int a : nums) al.add(a);

        int indexOfOne = al.indexOf(1);
        if (indexOfOne == -1) return 1;

        Collections.sort(al);

        HashSet<Integer> set = new HashSet<>(al);
        al.clear();
        al.addAll(set);
        set.clear();
        Collections.sort(al);
        indexOfOne = al.indexOf(1);

        System.out.println("Arraylist = " + al);
        int element = 1;
        for (int i = indexOfOne; i < al.size(); i++) {
            if (al.get(i) != element) return element;
            element++;
        }
        return element;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 3, 1, 0, 4, 0};
        System.out.println("Given input array = " + Arrays.toString(nums));
        int ans = firstMissingPositive(nums);
        System.out.println("First missing positive integer = " + ans);
    }
}
