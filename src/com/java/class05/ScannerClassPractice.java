package com.java.class05;

import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if(num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        } else if (num1 == num2) {
            System.out.println("Numbers are equal");
        }
    }
}
