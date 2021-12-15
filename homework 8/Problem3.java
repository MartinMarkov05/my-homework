package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("о");
                for (int s = 1; s <= j; s++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
