package com.java.homework;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= factorial; i++){
            num = num * i;
        }
        System.out.println(num);
    }
}
