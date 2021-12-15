package com.company;

public class Main {

    public static void main(String[] args) {
	byte age = 4;
    float price = 50000;
    boolean isAHighClass = (age > 5 && price > 20000) ||  (age <= 5 && price > 40000);
    String result = isAHighClass? "Висок клас" : "Не е висок клас";
    System.out.println(result);
    }
}
