package com.shraddha;

public class ImplementStr {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println("heystack string = " + haystack + "\n" + "needle string = " + needle);
        System.out.println("Index of needlw in heystack = " + strStr(haystack, needle));
    }
}
