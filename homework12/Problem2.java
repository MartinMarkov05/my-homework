package com.company;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(returnDayOfTheWeek(a));
    }
    public static String returnDayOfTheWeek(int n){
        switch (n){
            case 1: return ("Monday");
            case 2: return ("Tuesday");
            case 3: return ("Wednesday");
            case 4: return ("Thursday");
            case 5: return ("Friday");
            case 6: return ("Saturday");
            case 7: return ("Sunday");
            default: return ("Maybe in another universe :)");
        }
    }
}
