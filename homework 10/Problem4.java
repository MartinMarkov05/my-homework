package com.company;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args){
        int[][] matrix = {
                {11, 12, 13, 14, 15, 16,},
                {21, 22, 23, 24, 25, 26,},
                {31, 32, 33, 34, 35, 36,},
                {41, 42, 43, 44, 45, 46,},
                {51, 52, 53, 54, 55, 56,},
                {61,62,63,64,65,66}
        };
        int[] sumCol1 = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sumCol1[i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(sumCol1));

    }
    //не е дорешена
}
