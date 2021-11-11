package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (ch == strs[j].charAt(i)) {
                    continue;
                } else return ans;
            }
            ans += ch;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] inputString = {"dog", "racecar", "car"};
        System.out.println("Input String array = " + Arrays.toString(inputString));
        String longestPrefix = longestCommonPrefix(inputString);
        System.out.println("Longest Common prefix = " + longestPrefix);
    }
}
