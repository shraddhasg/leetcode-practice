package com.shraddha;

import java.util.*;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>(nums1.length + nums2.length);

        for (Integer element : nums1) al.add(Integer.valueOf(element));
        for (Integer element : nums2) al.add(Integer.valueOf(element));
        Collections.sort(al);
        System.out.println("Sorted Arraylist = " + al);

        int index = al.size() / 2;
        if (al.size() % 2 != 0) return (double) al.get(index);
        return (double) (al.get(index) + al.get(index - 1)) / 2;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1};
        int[] nums2 = {1, 2};
        System.out.println("Numbers arrays one = " + Arrays.toString(nums1) + "\n" + "Numbers array two = " + Arrays.toString(nums2));
        double ans = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of two sorted arrays = " + ans);
    }
}
