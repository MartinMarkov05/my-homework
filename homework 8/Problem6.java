package com.company;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 20) {
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n + i; j++) {
                    System.out.print(j);

                }
                System.out.println();
            }
        }
    }
}

