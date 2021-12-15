package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scenner = new Scanner(System.in);
        int a = scenner.nextInt();
        int n = scenner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= n){
            result = result * a;
            i++;
        }
        System.out.println(result);
    }
}
