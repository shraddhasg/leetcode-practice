package com.shraddha;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) temp[j][i] = matrix[i][j];
//            for (int j = matrix[i].length-1; j >=0 ; j--) temp

        }
        for (int i = 0; i < matrix.length; i++) matrix[i] = temp[i];

        System.out.println("After rotation 2D array = ");
        for (int[] a : matrix) System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Input 2D array = ");
        for (int[] a : arr) System.out.println(Arrays.toString(a));
        rotate(arr);
    }
}
