package com.shraddha;

import java.util.*;

public class LargestRectangleInHistogram {
    public static ArrayList<Integer> lowestFromLeft(int[] arr) {
        ArrayList<Integer> left = new ArrayList<>(arr.length);

        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                left.add(-1);
                stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek().getValue() < arr[i]) {
                        left.add(stack.peek().getKey());
                        stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
                        break;
                    } else stack.pop();
                }
            }
            if (stack.isEmpty()) {
                stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
                left.add(-1);
            }
        }
        System.out.println("Lowest from left = " + left);
        return left;
    }

    public static ArrayList<Integer> lowestFromRight(int[] arr) {
        ArrayList<Integer> right = new ArrayList<>(arr.length);

        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                right.add(arr.length);
                stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek().getValue() < arr[i]) {
                        right.add(stack.peek().getKey());
                        stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
                        break;
                    } else stack.pop();
                }
            }
            if (stack.isEmpty()) {
                right.add(arr.length);
                stack.push(new AbstractMap.SimpleEntry<Integer, Integer>(i, arr[i]));
            }
        }
        Collections.reverse(right);
        System.out.println("Lowest from right = " + right);
        return right;
    }

    public static int largestRectangleArea(int[] heights) {
        ArrayList<Integer> left = lowestFromLeft(heights);
        ArrayList<Integer> right = lowestFromRight(heights);

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < heights.length; i++) {
            int val = (right.get(i) - left.get(i) - 1) * heights[i];
            if (maxArea < val) maxArea = val;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Heights =" + Arrays.toString(heights));
        int maxArea = largestRectangleArea(heights);
        System.out.println("Largest Area = " + maxArea);
    }
}
