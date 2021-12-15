package com.company;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digitA = number / 10000;
        int digitB = (number / 1000) % 10;
        int digitC = (number / 100) % 10;
        int digitD = (number / 10) % 10;
        int digitE = number % 10;
        if (number >= 100 && number <= 999) {
            System.out.print(digitC);
            for (int i = 0; i < digitC; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 0; i < digitD; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 0; i < digitE; i++) {
                System.out.print("*");
            }
        } else if (number >= 100 && number <= 9999) {
            System.out.print(digitB);
            for (int i = 1; i <=digitB; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitC);
            for (int i = 1; i <= digitC; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 1; i <= digitD; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 1; i <= digitE; i++) {
                System.out.print("*");
            }
        } else if (number >= 100 && number <= 30000) {
            System.out.print(digitA);
            for (int i = 1; i <= digitA; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitB);
            for (int i = 1; i <=digitB; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitC);
            for (int i = 1; i <= digitC; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitD);
            for (int i = 1; i <= digitD; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print(digitE);
            for (int i = 1; i <= digitE; i++) {
                System.out.print("*");
            }
        }
    }
}

