package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(isDividedWithoutReminder(a,b,c));
    }
    public static boolean isDividedWithoutReminder(int a, int b, int c){
        boolean isDivided = a % b == 0 && a % c ==0;
        return isDivided;
    }
}
