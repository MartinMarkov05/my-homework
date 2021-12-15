package com.company;

import java.util.Scanner;

public class IsNumberPerfect {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        int devident = 1;
        int result = 0;
        while (i<=number){
            if(number % i == 0){
                devident = number / i;
                System.out.println(devident);
                result = result + devident;
            }
            i++;
        }
        System.out.println(result);
        if( result == number){
            System.out.println("It is a perfect");
        }else{
            System.out.println(number + " is not perfect");
        }
    }
}
