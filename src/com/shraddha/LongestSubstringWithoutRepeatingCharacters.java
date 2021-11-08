package com.shraddha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static boolean isUniqueCharsInString(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if (map.containsKey(str.charAt(i))) return false;
            map.put(str.charAt(i),1);
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
//        ArrayList<Integer> al = new ArrayList<>();
        Set<Integer> al = new HashSet<>();

        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                String subString = s.substring(i,j);
                if (isUniqueCharsInString(subString)) al.add(subString.length());
            }
        }
        System.out.println(al);
        Object[] arr = al.toArray();
        return (int) arr[arr.length-1];

    }
    public static void main(String[] args) {
        String inputString = "pwwkew";
        System.out.println("Input String = "+inputString);
        int ans = lengthOfLongestSubstring(inputString);
        System.out.println("Longest Substring Without Repeating Characters = "+ans);
    }
}
