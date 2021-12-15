package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(areRemindersSame( a,b));
    }
    public static boolean areRemindersSame(int a, int b){
        int reminderA = a % 3;
        int reminderB = b % 3;
        boolean areSame = reminderA == reminderB;
        return areSame;
    }
}
