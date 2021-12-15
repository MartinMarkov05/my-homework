package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 2, 3, 10, 7},
                {10, 3, 10, 9, 1},
                {7, 2, 9, 4, 4},
        };
       int row = matrix.length;
       int col = matrix[0].length;
       int[] result = new int[row * col];
       int k = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                 result[k] = matrix[i][j];
                 k++;
            }
        }
        int swap = 0;
        for (int i = 0; i < result.length ; i++) {
            for (int j = 1; j < result.length ; j++) {
             if(result[j - 1] > result[j]){
                 swap = result[j - 1];
                 result[j - 1] = result[j];
                 result[j] = swap;
             }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
