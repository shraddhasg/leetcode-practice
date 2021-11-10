package com.shraddha;

import java.util.*;

public class ContainerWithMostWater {
    public static ArrayList<Integer> largestElementIndexFromRight(int[] height) {
        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(height.length);

        for (int i = height.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.push(new AbstractMap.SimpleEntry<>(i, height[i]));
                ans.add(0);
            } else {
                if (stack.peek().getValue() >= height[i]) {
                    ans.add(stack.peek().getKey());
                    stack.push(new AbstractMap.SimpleEntry<>(i, height[i]));
                } else {
                    while (!stack.isEmpty()) {
                        int val = stack.peek().getValue();
                        if (val < height[i]) stack.pop();
                        else {
                            ans.add(stack.peek().getKey());
                            stack.push(new AbstractMap.SimpleEntry<>(i, height[i]));
                            break;
                        }
                    }
                    if (stack.isEmpty()) {
                        stack.push(new AbstractMap.SimpleEntry<>(i, height[i]));
                        ans.add(0);
                    }
                }
            }
        }
//        System.out.println(ans);
        Collections.reverse(ans);
        return ans;
    }

    public static void maxArea(int[] height) {
        ArrayList<Integer> largestFromRight = largestElementIndexFromRight(height);
        System.out.println(largestFromRight);
        int max = Integer.MIN_VALUE;
        int val = 0;
        for (int i = 0; i < height.length; i++) {
            if (largestFromRight.get(i) == 0) {
            } else val = Math.abs(largestFromRight.get(i) - i) * height[i];
            System.out.println(val);
            max = Math.max(max, val);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] height = {1, 2, 1};
        System.out.println("Input height array = " + Arrays.toString(height));
        maxArea(height);
    }
}
