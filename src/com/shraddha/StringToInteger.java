package com.shraddha;

public class StringToInteger {
    public static boolean isValid(String str) {
        String sign = "";
        if (Character.isDigit(str.charAt(0))) return true;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.length() == 1) return true;
            if (!Character.isDigit(str.charAt(1))) return false;
        } else return false;
        return true;
    }

    public static int stringToIntConversion(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '.') return 0;
        System.out.println(s);

        if (s.indexOf('.') > 0) s = s.substring(0, s.indexOf('.'));

        String[] str = s.split(" ");
        for (String a : str) {
            if (isValid(a)) {
                s = a;
                break;
            }
            return 0;
        }

        System.out.println(s);

        String data = "";
        String sign = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch) && data.length() == 0) return 0;

            if (!Character.isDigit(ch)) {
                if (s.length() == 1) return 0;
                if (ch == '+' || ch == '-') {
                    if (sign.length() > 0 && data.length() == 0) return 0;
                } else break;
                System.out.println("ch = " + ch);
                System.out.println(data + " data");

                if (ch != '+' && ch != '-' && ch != '.' && data.length() == 0) return 0;
                if (Character.isAlphabetic(ch)) return 0;
                if (ch == '+' || ch == '-') {
                    if (data.length() > 0) return 0;
                    System.out.println("))))))))))))))))");
                    System.out.println(s.charAt(i + 1) == '+');
                    System.out.println(s.charAt(i + 1) == '-');
                    if (s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-') return 0;
                    System.out.println("*******************");
                    if (ch == '-') sign = "-";
                }
            } else data += ch;
            System.out.println(data);
        }

        s = data;
        System.out.println(s);
        System.out.println("*******" + s);
        boolean dataSign = false;
        if (sign.length() > 0 && sign.charAt(0) == '-') dataSign = true;

        int val = 0;
        try {
            val = Integer.parseInt(s);
        } catch (Exception e) {
            if (dataSign) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        if (dataSign) return -Integer.parseInt(s);
        return Integer.parseInt(s);
    }


    public static int myAtoI(String s) {
        s = s.trim();
//        s = s.replace("+", "");
//        System.out.println(s);
        String data = "";
        String valSign = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.length() == 1) return 0;
            char ch = s.charAt(i);
            System.out.println("ch=" + ch);
            if (ch == ' ') break;
            if (!Character.isDigit(ch)) {
                if (ch == '.') data += ch;
                if (ch == '-' || ch == '+') {
                    if (s.charAt(i + 1) == '-' || s.charAt(i + 1) == '+') return 0;
                    valSign = ch + "";
                }
                if (ch != '-' && ch != '+' && ch != '.') break;
            } else data = data + ch;
        }

        s = valSign + data;
        System.out.println("))))" + s);

        String[] str = s.split(" ");
        s = str[0];

        char firstChar = s.charAt(0);
        System.out.println("first char = " + firstChar);
        boolean sign = false;
        if (!Character.isDigit(firstChar)) {
            if (s.length() == 1) return 0;
            if (!Character.isDigit(s.charAt(1))) return 0;
            if (firstChar == '-') {
                sign = true;
                s = s.substring(1);
            } else if (firstChar == '+') s = s.substring(1);
            else return 0;
        }
        System.out.println("*****");
        System.out.println("S = " + s);

        int val = 0;
        if (s.indexOf('.') >= 0) {
            int index = s.indexOf('.');
            s = s.substring(0, index);
        }
        try {
            val = Integer.parseInt(s);
        } catch (Exception e) {
            if (sign) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
        if (sign) return -Integer.parseInt(s);
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        String inputString = "-5-";
        System.out.println("Input String= " + inputString);
//        int ans = myAtoI(inputString);
        int ans = stringToIntConversion(inputString);
        System.out.println("Integer value of string = " + ans);
    }
}
