package com.shraddha;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String num = x + "";
        int left = 0, right = num.length() - 1;
        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = -1210;
        System.out.println("Input Number = " + number);
        System.out.println("Whether number is palindrom or not? = " + isPalindrome(number));
    }
}
