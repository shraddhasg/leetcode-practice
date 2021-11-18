package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeIntervals {
    public static int[][] merge(int[][] arr) {
        if (arr.length == 1 || arr.length == 0) return arr;

        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<int[]> temp = new ArrayList<>();

        al.add(arr[0][0]);
        al.add(arr[0][1]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i][1] < arr[i - 1][0]) {
                temp.add(arr[i - 1]);
                temp.add(arr[i]);
                al.clear();
                continue;
            }

            al.add(arr[i][0]);
            al.add(arr[i][1]);
            Collections.sort(al);

            if (al.get(1) != arr[i - 1][1]) {
                temp.add(new int[]{al.get(0), al.get(al.size() - 1)});
//                al.clear();
            } else if (al.get(1) == al.get(2)) {
                temp.add(new int[]{al.get(0), al.get(al.size() - 1)});
//                al.clear();
            } else {
                if (i == 1) temp.add(arr[0]);
                temp.add(arr[i]);
            }
        }
        System.out.println("*************");
        for (int[] a : temp) System.out.println(Arrays.toString(a));

        int[][] ans = new int[temp.size()][2];
        for (int i = 0; i < temp.size(); i++) ans[i] = temp.get(i);

//        merge(ans);
        return ans;
    }

    public static void merge1(int[][] intervals) {
        ArrayList<int[]> al = new ArrayList<>();
        int[] arr = new int[2];
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (start < intervals[i][0]) {
                if (end < intervals[i][0]) {
                    int[] temp = {start, end};
                    al.add(temp);
                    start = intervals[i][0];
                    end = intervals[i][1];
                } else if (end < intervals[i][1]) end = intervals[i][1];
            } else if (start < intervals[i][0] && end >= intervals[i][1]) {
            } else if (start > intervals[i][0] && end > intervals[i][1]) {
                int[] temp = {start, end};
                al.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            } else if (start > intervals[i][0] && end < intervals[i][1]) {
                start = intervals[i][0];
                end = intervals[i][1];
            }
            al.add(new int[]{start, end});
            System.out.println("start = " + start + "\t" + "end = " + end);
        }

        int[][] ans = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) ans[i] = al.get(i);
        System.out.println("********************");
        for (int[] a : ans) System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {0, 2}, {3, 5}};
        System.out.println("Input intervals = ");
        for (int[] a : arr) System.out.println(Arrays.toString(a));
        int[][] ans = merge(arr);
        System.out.println("After merging intervals = ");
        for (int[] a : ans) System.out.println(Arrays.toString(a));
    }
}
