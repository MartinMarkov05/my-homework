
package com.company;

public class Main {

    public static void main(String[] args) {
        int points = 2;
        if (points >= 1 && points <= 3) {
            System.out.println(points * 10);
        } else if (points >= 4 && points <= 6) {
            System.out.println(points * 100);
        } else if (points >= 7 && points <= 9) {
            System.out.println(points * 1000);
        } else if (points == 0 || points >= 9) {
            System.out.println("Грешка");
        }
    }
}