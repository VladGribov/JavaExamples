package com.java.homework;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //Leap years are evenly divisible by 4
        if(year % 4 == 0) {
            //Leap years divisible by 100 also needs to be divisible by 400
            if(year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0 && year % 400 != 0) {
                System.out.println(year + " is not a Leap Year");
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
