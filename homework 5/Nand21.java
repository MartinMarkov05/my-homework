package com.company;

import java.util.Scanner;

public class Nand21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = n - 21;
        if (x > 0 && x < 21) {
            System.out.println(x);
        }
        if (x < 0) {
            System.out.println(-x);
        } else if (x > 21) {
            System.out.println(x * 2);
        }
    }
}
