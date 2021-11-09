package com.shraddha;

import java.util.ArrayList;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        ArrayList<Integer> rows = new ArrayList<>();
        int tempRows = 0;
        if (numRows % 2 == 0) tempRows = numRows + 1;

        if (tempRows > 0) for (int i = tempRows; i > 0; i = i - 2) rows.add(i);
        else for (int i = numRows; i > 0; i = i - 2) rows.add(i);

        for (int i = 0; i < numRows / 2; i++) rows.addAll(rows);

        String ans = "";

        int count = 0;
        System.out.println("Rows al = " + rows);
        System.out.println(s.length());

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j = j + rows.get(i) + 1) {
                ans += s.charAt(j);
                System.out.println(ans);
            }
        }
        System.out.println(ans);

//        for (int i = 0; i < rows.size(); i++) {
//            index = i;
//            while (index < s.length()) {
//                ans += s.charAt(index);
//                System.out.println("***" + ans);
//                index += rows.get(i);
//            }
//        }
//        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String inputString = "PAYPALISHIRING";
        int rows = 4;
        System.out.println("Input String = " + inputString + "\n" + rows);
        String ans = convert(inputString, rows);
        System.out.println("Zigzag Conversion = " + ans);
    }
}
