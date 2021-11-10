package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p.length() == 1) {
            if (s.length() > 1) {
                if (p.charAt(0) != '*') return false;

                HashSet<Character> set = new HashSet<>();
                for (int i = 0; i < s.length(); i++) set.add(s.charAt(i));
                ArrayList<Character> al = new ArrayList<>(set);

                if (al.get(0) != p.charAt(0)) return false;
            }
            return true;
        }
        int i, index;
        for (i = 0, index = 0; i <= p.length() - 1 && index < s.length(); ) {
            System.out.println("i= " + i + "\t" + "index = " + index);
            if (p.charAt(i) == '.') {
                index++;
                i++;
                continue;
            }
            if (i < p.length() - 1 && p.charAt(i + 1) == '*') {
                if (p.charAt(i) != s.charAt(index)) {
//                    index++;
                } else {
                    while (index < s.length() && p.charAt(i) == s.charAt(index)) {
                        index += 1;
                        System.out.println("**");
                    }
                }
                i += 2;
                continue;
            } else if (p.charAt(i) != s.charAt(index)) {
                if (p.charAt(i) != '*') return false;

                if (index == s.length() - 1) return true;
                while (index < s.length() && s.charAt(index) == s.charAt(index + 1)) index += 1;
            }

            index++;
            i++;
        }
        if (i != p.length() || index != p.length()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println("Input String = " + s + "\n" + "Given Pattern " + p);
        System.out.println("Is matching ? = " + isMatch(s, p));
    }
}
