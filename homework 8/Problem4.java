package com.company;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int largest = 1;
        int smallest = 1;
        for (int i = 1; i > 0; i++) {
            int n = sc.nextInt();
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
            if (n == 0){
                break;
            }
        }

        System.out.println("largest number is : " + largest);
        System.out.println("smallest number is : " + smallest);
    }

}






