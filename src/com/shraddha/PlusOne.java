package com.shraddha;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int a : digits) str += a;

        BigInteger integer = new BigInteger(str);
        BigInteger one = new BigInteger(1 + "");
        BigInteger addition = integer.add(one);

        str = addition + "";

        int[] ans = new int[str.length()];
        
        String[] chArray = str.split("");
        for (int i = 0; i < chArray.length; i++) ans[i] = Integer.parseInt(chArray[i]);

        return ans;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println("Digits array = " + Arrays.toString(digits));
        int[] ans = plusOne(digits);
        System.out.println("After adding one = " + Arrays.toString(ans));
    }
}
