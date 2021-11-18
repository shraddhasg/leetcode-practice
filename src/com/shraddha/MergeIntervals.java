package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static void merge(int[][] intervals) {
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
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println("Input intervals = ");
        for (int[] a : arr) System.out.println(Arrays.toString(a));
        merge(arr);
    }
}
