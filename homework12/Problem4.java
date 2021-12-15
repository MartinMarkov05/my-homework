package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        System.out.println(isTheLetterVowel(letter));
    }

    public static String isTheLetterVowel(String letter) {
        String[] letters = {"a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y"};
        for (int i = 0; i < letters.length; i++) {
            if (Objects.equals(letter, letters[i])) {
                return (letter + " " + " is vowel");
            }
        }
        return (letter + " " + "is not a vowel");
    }
}
