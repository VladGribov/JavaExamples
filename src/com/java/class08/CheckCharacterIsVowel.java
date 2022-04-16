package com.java.class08;

import java.util.Scanner;

public class CheckCharacterIsVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().toLowerCase().charAt(0);
        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println(input + " is a vowel");
        } else {
            System.out.println(input + " is not a vowel");
        }
    }
}
