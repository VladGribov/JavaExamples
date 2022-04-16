package com.java.homework;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reversed = 0;
        int original = x;
        if(x>=0){
            while(x != 0){
                int lastPlace = x%10;
                x/=10;
                reversed = reversed*10 + lastPlace;
            }
            if(original == reversed){
                System.out.println(original + " is a palindrome");
            }else{
                System.out.println(original + " is not a palindrome");
            }
        }
    }
}
