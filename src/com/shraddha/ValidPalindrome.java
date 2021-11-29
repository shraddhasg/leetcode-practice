package com.shraddha;

import java.util.Locale;

public class ValidPalindrome {
    public static String getString(String str) {
        String outputString = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)))
                outputString += str.charAt(i);
        }
        System.out.println("Output string = " + outputString.toLowerCase());
        return outputString.toLowerCase();
    }

    public static String getReverseString(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) revString += str.charAt(i);
        System.out.println("Reverse output string = " + revString.toLowerCase());

        return revString.toLowerCase();
    }

    public static boolean isPalindrome(String s) {
        String outputString = getString(s);
        String revOutputString = getReverseString(outputString);

        return outputString.equals(revOutputString);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Input string  = " + input);
        System.out.println("Is palindrome ? = " + isPalindrome(input));
    }
}
