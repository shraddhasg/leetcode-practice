package com.shraddha;

public class ReverseBits {
    public static String intToBinary(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary representation = " + binary);

        int count = 32 - binary.length();
        StringBuilder precedingZeroes = new StringBuilder();
        while (count != 0) {
            precedingZeroes.append("0");
            count--;
        }
        return precedingZeroes + binary;
    }

    public static String reverseString(String str) {
        StringBuilder s = new StringBuilder(str);
        return s.reverse() + "";
    }

    public static int binaryStringToInt(String binary) {
        int val = Integer.parseInt(binary, 2);
        System.out.println("Val = " + val);
        return val;
    }

    public static int reverseBits(int n) {
        String binary = intToBinary(n);
        binary = reverseString(binary);
        return binaryStringToInt(binary);
    }

    public static void main(String[] args) {
        int n = 43261596;
        System.out.println("N = " + n);
        int ans = reverseBits(n);
        System.out.println("Ans = " + ans);
    }
}
