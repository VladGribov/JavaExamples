package com.java.class11;

import java.util.Scanner;

public class InClassExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i = 1;
        while(i<=limit){
            if(i%3==0){
                System.out.println("*");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
