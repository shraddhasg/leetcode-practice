package com.shraddha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static HashMap<Integer, String> getMap() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        System.out.println("Map = " + map);
        return map;
    }

    public static ArrayList<String> getRespectiveStrings(String digits) {
        HashMap<Integer, String> map = getMap();
        ArrayList<String> listOfStrings = new ArrayList<>(digits.length());

        for (int i = 0; i < digits.length(); i++) listOfStrings.add(map.get(Integer.parseInt(digits.charAt(i) + "")));

        return listOfStrings;
    }

    public static void letterCombinations(String digits) {
        ArrayList<String> listOfStrings = getRespectiveStrings(digits);
        System.out.println("List of Strings = " + listOfStrings);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < listOfStrings.get(0).length(); i++) ans.add(listOfStrings.get(0).charAt(i) + "");
        if (listOfStrings.size() > 1) {
            for (int i = 1; i < listOfStrings.size(); i++) {
                for (int j = 0; j < listOfStrings.get(i).length(); j++) {
                    ans.add(ans.get(j) + listOfStrings.get(i).charAt(j) + "");
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println("Input Digits String = " + digits);
        letterCombinations(digits);
    }
}
