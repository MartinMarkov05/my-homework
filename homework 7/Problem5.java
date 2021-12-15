package com.company;

import java.util.Random;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(20) + 1;
        System.out.println("Въведете предположение от 1 до 20:");
        int i = 1;
        int myNumber;
        while (i < randomNumber) {
            myNumber = scanner.nextInt();
            if (myNumber > randomNumber) {
                System.out.println("Too high, try again");
            }else if(myNumber < randomNumber){
                System.out.println("Too low, try again");
            }
            i++;
        }
        myNumber = scanner.nextInt();
        System.out.println("You guessed right," + myNumber + " is the correct number");
    }
}
