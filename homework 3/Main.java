package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 20;
    int b = 13;
    int c = 21;
    boolean isABMoreThan21 = c > a && c > b && a > b;
    int result = isABMoreThan21? a : 0;
    System.out.println(result);
    }
}
