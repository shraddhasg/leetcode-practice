package com.shraddha;

import java.math.BigInteger;

public class ReverseInteger {
    public static int reverse(String x) {

        try {
            int data = Integer.parseInt(x);
        } catch (Exception e) {
            return 0;
        }
      
//        BigInteger val = new BigInteger(x);
//        BigInteger max = new BigInteger(Integer.MAX_VALUE + "");
//        BigInteger min = new BigInteger(Integer.MIN_VALUE + "");
//        if (val.compareTo(max) == 1 || val.compareTo(min) == -1 || val.compareTo(min) == 0) return 0;
        String num = x + "";
        System.out.println(num.charAt(0));
        StringBuffer numStringBuffer = new StringBuffer(num);
        num = numStringBuffer.reverse().toString();
        System.out.println(num);

        int data = Integer.parseInt(x);
        if (data < 0) {
            num = num.substring(0, num.length() - 1);
            return -Integer.parseInt(num);
        }
        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        String x = "-964632434";
        System.out.println("Input integer = " + x);
        int ans = reverse(x);
        System.out.println("Reverse of X= " + ans);
    }
}
