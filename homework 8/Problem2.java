package com.company;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        for (int i = 0; i <= n; i++){
            if(i % 5 ==0){
                System.out.println(i);
            }

        }
    }
}
