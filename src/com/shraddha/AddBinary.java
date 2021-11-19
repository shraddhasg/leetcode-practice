package com.shraddha;

public class AddBinary {
    public static int binaryToInteger(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) num += (int) Math.pow(2, i);

        return num;
    }

    public static String integerToBinary(int data) {
        String ans = "";
        int rem = 0;
        while (data > 1) {
            rem = data % 2;
            ans += rem;
            data = data / 2;
        }
        ans += 1;
        String binary = "";

        for (int i = ans.length() - 1; i >= 0; i--) binary += ans.charAt(i);
        return binary;
    }

    public static String addBinary(String a, String b) {
        int num1 = binaryToInteger(a);
        int num2 = binaryToInteger(b);
        num1 = num1 + num2;
        return integerToBinary(num1);
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println("A = " + a + "\n" + "B = " + b);

        String ans = addBinary(a, b);
        System.out.println("Addition of binary = " + ans);
    }
}
