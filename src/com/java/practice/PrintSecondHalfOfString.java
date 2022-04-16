package com.java.practice;

import java.util.Scanner;

public class PrintSecondHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        String newStr = "";
        //dogie
        for(int i = (str.length()+1)/2; i<=str.length()-1; i++){
            newStr +=str.charAt(i);
        }
        System.out.println(newStr);
    }
}
