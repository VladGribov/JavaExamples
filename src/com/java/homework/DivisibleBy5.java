package com.java.homework;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div5 = sc.nextInt();
        if(div5 % 5 == 0) {
            System.out.println(div5 + " is divisible by 5");
        } else {
            System.out.println(div5 + " is not divisible by 5");
        }
    }
}
