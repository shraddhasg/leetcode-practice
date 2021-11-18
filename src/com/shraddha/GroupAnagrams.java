package com.shraddha;

import java.util.*;

public class GroupAnagrams {
    public static HashMap<String, ArrayList<String>> getMap(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            String a = new String(ch);
            ArrayList<String> al;
            if (map.containsKey(a)) {
                al = map.get(a);
            } else {
                al = new ArrayList<>();
            }
            al.add(str[i]);
            map.put(a, al);
        }
        System.out.println("Map = " + map);
        return map;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = getMap(strs);
        List<List<String>> ans = new ArrayList<>();
        for (ArrayList<String> al : map.values()) ans.add(al);

        return ans;
    }

    public static void main(String[] args) {
        String[] strs = {"a"};
        System.out.println("Input string array = " + Arrays.toString(strs));
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println("Group anagrams = " + ans);
    }
}
