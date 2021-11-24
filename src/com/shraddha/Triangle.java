package com.shraddha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        for (List<Integer> al : triangle) {
            Collections.sort(al);
            sum += al.get(0);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(2);
        triangle.add(one);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(3);
        two.add(4);
        triangle.add(two);

        ArrayList<Integer> three = new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);
        triangle.add(three);

        ArrayList<Integer> four = new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        triangle.add(four);

        System.out.println(triangle);

        int minimumSum = minimumTotal(triangle);
        System.out.println("Minimum sum = " + minimumSum);
    }
}
