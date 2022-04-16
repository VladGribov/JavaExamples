package com.java.homework;
import java.util.*;
public class PlindromeS {
    public static void main(String[] args) {
        //palindrome "racecar", "mom"
        //need to take an input from the user
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        //we need to compare word to word backwards "word" == "drow"
        //we need to invert our original word
        String inverted = ""; //inverted string

        //int word = "dog";
        for(int i=word.length()-1; i>=0; i--){
            inverted = inverted + word.substring(i, i+1);
        }

        System.out.println("Inverted word: " + inverted);
        //palindrome: if string reads the same forwards and backwards it is a palindrome
        if(word.equals(inverted)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
