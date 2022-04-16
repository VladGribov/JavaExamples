package com.java.class06;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Number is > 0");
        } else if (num < 0) {
            System.out.println("Number is < 0");
        } else {
            System.out.println("Number = 0");
        }
    }
}
