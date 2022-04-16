package com.java.practiceZoom;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        //Any year divisible by 4. If the leap year is divisible by 100 it has to be divisible by 400 also.
        if(year % 4 == 0){
            if(year % 100 == 0 && year % 400 == 0){
                System.out.println(year + " is a leap year");
            } else if(year % 100 == 0 && year % 400 != 0){
                System.out.println(year + " is not a leap year");
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not leap year");
        }

    }
}
