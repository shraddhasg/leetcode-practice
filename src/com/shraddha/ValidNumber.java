package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidNumber {
    public static int countDot(ArrayList<Character> a) {
        int count = 0;
        for (Character ch : a) {
            count++;
            if (count > 1) return 10;
        }
        return count;
    }

    public static boolean isNumber(String s) {
        int len = s.length();
        if ((len == 1) && !Character.isDigit(s.charAt(0))) return false;

        ArrayList<Character> a = new ArrayList(Arrays.asList(s.split("")));
        System.out.println(a);

        if (a.contains('.')) {
            int count = countDot(a);
            if (count > 1) return false;
        }
        if (a.contains('e') || a.contains('E')) {
            if (a.get(0) != 'e' || a.get(0) != 'E') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = ".1";
        System.out.println("Input string = " + s);
        System.out.println("Is valid string ? " + isNumber(s));
    }
}
