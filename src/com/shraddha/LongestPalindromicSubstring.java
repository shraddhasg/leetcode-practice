package com.shraddha;

public class LongestPalindromicSubstring {
    public static int[][] longestCommonSubstring(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] t = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    t[i][j] = 1 + t[i - 1][j - 1];
                else
                    t[i][j] = 0;
            }
        }
        System.out.println(t[m][n]);
        return t;
    }

    public static String longestPalindrome(String str) {
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) revString += str.charAt(i);
        System.out.println("Rev s = " + revString);
        int m = str.length();
        int n = revString.length();
        int[][] t = longestCommonSubstring(str, revString);

        int i = m, j = n;
        String a = str, b = revString;
        String s = "";
        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                s += a.charAt(i - 1);
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j])
                    j--;
                else
                    i--;
            }
        }
        System.out.println(s);
        StringBuffer sb = new StringBuffer(s);
        // String result = "";
        // for (i = a.length() - 1; i >= 0; i--)
        // result += s.charAt(i);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String inputString = "aacabdkacaa";
        System.out.println("Input String =" + inputString);
        String str = longestPalindrome(inputString);
        System.out.println("Longest palindrome = " + str);
    }
}
