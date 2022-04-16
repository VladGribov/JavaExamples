package com.java.homework;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String:");
        String word = sc.nextLine().toLowerCase();
        String newStr = "";
        //invert string
        for(int i = word.length()-1; i >=0; i--){
            newStr += word.substring(i, i+1);
        }
        if(newStr.equals(word)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
