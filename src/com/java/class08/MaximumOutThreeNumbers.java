package com.java.class08;

import java.util.Scanner;

//take three numbers form users and print maximum numbers out of three numbers
public class MaximumOutThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println("Max is: " + a);
        } else if(b>a && b>c) {
            System.out.println("Max is: " + b);
        } else if(c>a && c>b) {
            System.out.println("Max is: " + c);
        } else if(a==b && b>c) {
            System.out.println("Max is: " + b);
        } else if(a==b && b<c) {
            System.out.println("Max is: " + c);
        } else if(a==c && b>a) {
            System.out.println("Max is: " + b);
        } else if(a==c && b<a) {
            System.out.println("Max is: " + a);
        } else if(c==b && a<c) {
            System.out.println("Max is: " + c);
        } else if(c==b && a>c) {
            System.out.println("Max is: " + a);
        } else if(c==b && a==c) {
            System.out.println("Numbers are equal");
        }
    }
}
