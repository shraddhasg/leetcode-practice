package com.shraddha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public static HashMap<Integer, String> createMap() {
        HashMap<Integer, String> romanValOfInt = new HashMap<>();
        romanValOfInt.put(1, "I");
        romanValOfInt.put(4, "IV");
        romanValOfInt.put(5, "V");
        romanValOfInt.put(9, "IX");
        romanValOfInt.put(10, "X");
        romanValOfInt.put(50, "L");
        romanValOfInt.put(100, "C");
        romanValOfInt.put(500, "D");
        romanValOfInt.put(1000, "M");
        return romanValOfInt;
    }

    public static void intToRoman(int num) {
        HashMap<Integer, String> romanValOfInt = createMap();
        System.out.println(romanValOfInt);
        ArrayList<Integer> al = new ArrayList<>();
        while (num > 0) {
            al.add(num % 10);
            num = num / 10;
        }
//        Collections.reverse(breakoutOfInt);
        ArrayList<Integer> breakoutOfInt = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            breakoutOfInt.add((int) (al.get(i) * Math.pow(10, i)));
        }
        System.out.println(breakoutOfInt);
    }

    public static String convertIntoRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println(roman);
        return roman.toString();
    }

    public static void main(String[] args) {
        int input = 1994;
        System.out.println("Input = " + input);
        intToRoman(input);
        String ans = convertIntoRoman(input);
        System.out.println("Roman conversion = " + ans);
    }
}
