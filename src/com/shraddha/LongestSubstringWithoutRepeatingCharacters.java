package com.shraddha;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int uniqueCharacters(String str) {
        int n = str.length();
        int res = 0;

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[str.charAt(j)] == true)
                    break;
                else {
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
//        System.out.println(res);
        return res;
    }

    public static int longestUniqueCharSubstring(String str) {
        return uniqueCharacters(str);
//        HashSet<Character> set = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) set.add(str.charAt(i));
//        String uniqueCharString = "";
//       Iterator iterator = set.iterator();
//       while (iterator.hasNext()) uniqueCharString+=iterator.next();
//
//        System.out.println(str+"\n"+uniqueCharString);
    }

    public static boolean isUniqueCharsInString(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) return false;
            map.put(str.charAt(i), 1);
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
//        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> al = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);
                if (isUniqueCharsInString(subString)) al.add(subString.length());
            }
        }
        System.out.println(al);
        Object[] arr = al.toArray();
        return (int) arr[arr.length - 1];

    }

    public static void main(String[] args) {
        String inputString = "abcabcbb";
        System.out.println("Input String = " + inputString);
//        int ans = lengthOfLongestSubstring(inputString);
//        System.out.println("Longest Substring Without Repeating Characters = "+ans);
        int ans = longestUniqueCharSubstring(inputString);
        System.out.println("Longest Substring Without Repeating Characters = " + ans);
    }
}
