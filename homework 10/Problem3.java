package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
       int[][] matrix = {
               {16,3,2,14},
               {5,10,12,8},
               {9,7,7,12},
               {5,15,14,1}
       };
        int diagonal1 = 0;
        int diagonal2 = 0;
        int[] sumRow = new int[matrix.length];
        int[] sumCol = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumRow[i] = sumRow[i] + matrix[i][j];
                sumCol[j] = sumCol[j] + matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
                diagonal1 = diagonal1 + matrix[i][i];
        }
        for (int i = matrix.length - 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                diagonal2 = diagonal2 + matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {

        }
        System.out.println(Arrays.toString(sumRow));
        System.out.println(Arrays.toString(sumCol));
        System.out.println(diagonal1);
        System.out.println(diagonal2);
    }
    //не е дорешена
}
