package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
    public static String getStringFromArray(String[] words) {
        String str = "";
        for (String a :
                words)
            str += a;

        char[] s = str.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }

    public static void check(String[] words, String subString) {
        StringBuffer sb = new StringBuffer(subString);
        for (int i = words[0].length(); i < sb.length(); i += words[0].length()) sb.insert(i, " ");
        System.out.println("= " + sb);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        String wordsString = getStringFromArray(words);
        int wordsStringLength = wordsString.length();

        System.out.println("Words String = " + wordsString);

        List<Integer> ans = new ArrayList<>();

        String subString = "";
        for (int i = 0; i <= s.length() - wordsStringLength; ) {
            System.out.println("i = " + i);
            subString = s.substring(i, i + wordsStringLength);
            System.out.println(subString);
            char[] str = subString.toCharArray();
            Arrays.sort(str);
            subString = new String(str);

            if (wordsString.equals(subString)) {
                ans.add(i);
                i += words[0].length();
            } else i++;

        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "good"};
        check(words, s);
        System.out.println("Input string = " + s + "\n" + "Words array = " + Arrays.toString(words));
        List<Integer> ans = findSubstring(s, words);
        System.out.println("Ans = " + ans);
    }
}
