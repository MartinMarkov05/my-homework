package com.company;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        int i= 1;
        while (i<=number){
            result= result * number;
            i++;
            if(result>1000){
                System.out.println("грешка");
                break;
            }
            System.out.println(result);
        }
    }
}
