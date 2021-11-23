package com.shraddha;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static HashMap<Integer, Integer> getMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
        }
        System.out.println("Map = " + map);
        return map;
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = getMap(nums);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) if (entry.getValue() == 1) return entry.getKey();

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println("Input array = " + Arrays.toString(nums));
        int singleNumber = singleNumber(nums);
        System.out.println("Single Number = " + singleNumber);
    }
}
