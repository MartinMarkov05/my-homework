package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            int digitA = i / 1000;
            int digitB = (i / 100) % 10;
            int digitC = (i / 10) % 10;
            int digitD = i % 10;
            if (digitA + digitB == digitC + digitD) {
                System.out.println(i);
            }
        }
    }
}

