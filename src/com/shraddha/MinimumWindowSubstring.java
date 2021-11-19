package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumWindowSubstring {
    public static boolean isValid(String sortedSubstring, String sortedT) {
        char[] arr = sortedT.toCharArray();
        System.out.println("char [] = " + Arrays.toString(arr));
        for (char ch : arr) {
            int index = sortedSubstring.indexOf(ch);
            if (index >= 0)
                sortedSubstring = sortedSubstring.substring(0, index) + sortedSubstring.substring(index + 1);
        }
        int count = 0;
        for (char a : arr) if (a == ' ') count++;

        System.out.println("count = " + count);
        return count == sortedT.length();

    }

    public static String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        if (s.equals(t)) return s;

        ArrayList<String> ans = new ArrayList<>();

        String subString = "";
        char[] temp = t.toCharArray();
        String sortedSubstring = "";
        String sortedT = new String(temp);
        System.out.println("sorted t = " + sortedT);
        for (int i = 0; i < s.length() + 1; i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                subString = s.substring(i, j);
                System.out.println("substring = " + subString);
                char[] ch = subString.toCharArray();
                if (ch.length < t.length()) continue;
                Arrays.sort(ch);
                sortedSubstring = new String(ch);
                System.out.println("Sorted substring = " + sortedSubstring);
                System.out.println("sorted t = " + sortedT);
                System.out.println(sortedSubstring.contains(sortedT));

                if (isValid(sortedSubstring, sortedT)) ans.add(subString);
//                if (sortedSubstring.contains(sortedT)) ans.add(subString);
//                if (sortedSubstring.equals(sortedT)) return subString;
            }
        }
        System.out.println("**********");
        String minimumSubstring = ans.get(0);
        for (int i = 1; i < ans.size(); i++)
            if (minimumSubstring.length() > ans.get(i).length()) minimumSubstring = ans.get(i);

        return minimumSubstring;

    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ac";
//
//        for (int i = 0; i < t.length(); i++) {
//            for (int j = i + 1; j <= t.length(); j++) {
//                System.out.println(t.substring(i, j));
//            }
//        }

        System.out.println("S = " + s + "\n" + "T = " + t);
        String ans = minWindow(s, t);
        System.out.println("Minimum window substring = " + ans);
    }
}
