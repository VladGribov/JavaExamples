package com.java.class15;

import java.util.Locale;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String:");
        String in = sc.nextLine().toLowerCase(Locale.ROOT);
        System.out.println("Char:");
        String c = sc.nextLine();
        String[] arr = in.split("");
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(c)){
                count++;
            }
        }
        System.out.println(count);
    }

}
