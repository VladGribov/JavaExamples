package com.java.practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String newStr = "";
        for(int i = word.length()-1; i>=0; i--){
            newStr += word.charAt(i);
        }
        System.out.println(newStr);
    }
}
