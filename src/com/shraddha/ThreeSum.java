package com.shraddha;

import java.util.*;

public class ThreeSum {
    public static int tripletIndex(int iIndex, int jIndex, int toCheck, ArrayList<Integer> al) {
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int a : arr) al.add(a);
        System.out.println("i = " + iIndex + "\n" + "j = " + jIndex + "\n" + "Yocheck = " + toCheck);
        int index = al.indexOf(toCheck);
        for (int i = 0; i < al.size(); i++) {
            if (i == iIndex || i == jIndex) continue;
            if (al.get(i) == toCheck) return i;
        }
//        if (index != iIndex && index != jIndex) return index;
        return Integer.MIN_VALUE;
    }

//    public static void triplet(int[] nums) {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        ArrayList<String> alChar = new ArrayList<>(nums.length);
//        ArrayList<String> originalCharAl = new ArrayList<>(nums.length);
//        ArrayList<Integer> alNum = new ArrayList<>(nums.length);
//
//        for (int i = 0; i < nums.length; i++) {
//            alNum.add(nums[i]);
//            alChar.add(nums[i] + "");
//            originalCharAl.add(nums[i] + "");
//        }
//        System.out.println("alChar = " + alChar);
//        System.out.println("original =" + originalCharAl);
//        System.out.println("numal = " + alNum);
//
//        for (int i = 0; i < originalCharAl.size(); i++) {
//            if (alChar.get(i) != "T") {
////                alChar.clear();
//                Collections.copy(alChar, originalCharAl);
//            }
//            for (int j = 0; j < originalCharAl.size(); j++) {
//                if (i == j) continue;
//                int thirdElement = -(alNum.get(i) + alNum.get(j));
//                System.out.println("Third = " + thirdElement);
//                int index = tripletIndex(i, j, thirdElement, alChar);
//                System.out.println("index= " + index);
//                if (index >= 0 && index < alNum.size()) {
//                    ans.add(new ArrayList<>(Arrays.asList(alNum.get(i), alNum.get(j), alNum.get(index))));
//                    alChar.add(j, "T");
//                    alChar.add(index, "T");
//                } else break;
//            }
//            System.out.println(ans);
//        }
//        System.out.println(ans);
//
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for (int a : nums) list.add(a);

        List<List<Integer>> ans = new ArrayList<>();
        int thirdNum = -1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                thirdNum = -(list.get(i) + list.get(j));
                System.out.println("thirdNum = " + thirdNum);
                int index = tripletIndex(i, j, thirdNum, list);
                System.out.println("index = " + index);
                if (index != Integer.MIN_VALUE) {
                    ans.add(new ArrayList<>(Arrays.asList(list.get(i), list.get(j), list.get(index))));
//                    list.remove(j);
//                    list.remove(index);
                } else break;
            }
            System.out.println("List = " + ans);
        }

        List<List<Integer>> alList = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (List<Integer> al : ans) {
            System.out.println("***" + al);
            Collections.sort(al);
            set.add(al);
        }
        System.out.println(ans);
        System.out.println(set);
        for (List<Integer> a : set) alList.add(a);
//        return new List<List<Integer>>(set);
        System.out.println(alList);
        return alList;
    }

    public static void main(String[] args) {
        int[] nums = {34, 55, 79, 28, 46, 33, 2, 48, 31, -3, 84, 71, 52, -3, 93, 15, 21, -43, 57, -6, 86, 56, 94, 74, 83, -14, 28, -66, 46, -49, 62, -11, 43, 65, 77, 12, 47, 61, 26, 1, 13, 29, 55, -82, 76, 26, 15, -29, 36, -29, 10, -70, 69, 17, 49};
        System.out.println("Input Array = " + Arrays.toString(nums));
        threeSum(nums);
//        triplet(nums);
    }
}
