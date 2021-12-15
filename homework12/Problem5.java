package com.company;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(isTheYearLeap(year));
    }
    public static String isTheYearLeap(int year){
        if(year % 400 == 0 && year % 100 == 0){
            return (year + " " + "е високосна.");
        }else if(year % 4 == 0 && year % 100 == 0){
            return (year + " " + "не e високосна");
        }else if(year % 100 == 0){
            return (year + " " + " не е високосна.");
        }else if(year % 4 == 0){
            return (year + " " + " е високосна");
        }
        return (year + " " + " не е високосна.");
    }
}

