package com.shraddha;


import java.util.*;

class RemoveDuplicatesFromSortedArrayII {
    public static HashMap<Integer, Integer> getMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
        return map;
    }

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = getMap(nums);
        ArrayList<Integer> al = new ArrayList<>();

//        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                al.add(entry.getKey());
                al.add(entry.getKey());
            } else al.add(entry.getKey());
        }
        Collections.sort(al);
        System.out.println("Arraylist = " + al);
        for (int i = 0; i < al.size(); i++) nums[i] = al.get(i);
        return al.size();

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println("Input array = " + Arrays.toString(nums));
        int lengthOfArray = removeDuplicates(nums);
        System.out.println("Length after removing duplicates = " + lengthOfArray);
    }
}