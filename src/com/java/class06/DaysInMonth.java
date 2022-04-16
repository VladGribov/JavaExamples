package com.java.class06;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter month");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month) {
            case 1:
                System.out.println("31 days in January");
                break;
            case 2:
                System.out.println("28/29 days in February");
                break;
            case 3:
                System.out.println("31 days in March");
                break;
            case 4:
                System.out.println("30 days in April");
                break;
            case 5:
                System.out.println("31 days in May");
                break;
            case 6:
                System.out.println("30 days in June");
                break;
            case 7:
                System.out.println("31 days in July");
                break;
            case 8:
                System.out.println("31 days in August");
                break;
            case 9:
                System.out.println("30 days in September");
                break;
            case 10:
                System.out.println("31 days in October");
                break;
            case 11:
                System.out.println("30 days in November");
                break;
            case 12:
                System.out.println("31 days in December");
                break;
            default:
                System.out.println(month + " is not a month");

        }
    }
}
