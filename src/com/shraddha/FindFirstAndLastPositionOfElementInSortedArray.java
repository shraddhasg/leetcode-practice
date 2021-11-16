package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        for (int a : nums) al.add(a);

        ans[0] = al.indexOf(target);
        if (ans[0] == -1) {
            ans[1] = -1;
            return ans;
        }
        for (int i = ans[0]; i < al.size(); i++) {
            if (i == al.size() - 1 && al.get(i) == target) ans[1] = i;
            else if (al.get(i) != target) {
                ans[1] = i - 1;
                break;
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println("Input array = " + Arrays.toString(arr) + "\n" + "Target = " + target);
        int[] ans = searchRange(arr, target);
        System.out.println("Start and end indexes = " + Arrays.toString(ans));
    }
}
