package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        ArrayList<Integer> originalAl = new ArrayList<>(prices.length);
        ArrayList<Integer> toCheck = new ArrayList<>(prices.length);
        for (int a : prices) {
            originalAl.add(a);
            toCheck.add(a);
        }

        Collections.sort(toCheck);
        int smallNum = toCheck.get(0);
        int smallNumIndex = originalAl.indexOf(smallNum);

        if (smallNumIndex == originalAl.size() - 1) return 0
                ;
        ArrayList<Integer> largeNumAl = new ArrayList<>();
        for (int i = smallNumIndex; i < originalAl.size(); i++) largeNumAl.add(originalAl.get(i));

        Collections.sort(largeNumAl);
        return largeNumAl.get(largeNumAl.size() - 1) - originalAl.get(smallNumIndex);
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Prices = " + Arrays.toString(prices));
        int maxProfit = maxProfit(prices);
        System.out.println("Max profit = " + maxProfit);
    }
}
