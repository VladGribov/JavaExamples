package com.java.class06;

import java.sql.SQLOutput;
import java.util.Scanner;

//write a progrram when user enter any number 0-6
//print days of week
//0-sundeay 1- monday...
public class LadderIfElseExample {
    public static void main(String[] args) {
        //input
        System.out.println("Enter any number from 0 - 6:");
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();

        //output
        if(dayNum == 0){
            System.out.println("Sunday");
        } else if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Please enter from 0-6 only");
        }
    }
}
