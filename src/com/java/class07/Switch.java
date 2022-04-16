package com.java.class07;

import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine().toLowerCase();
        switch(month) {
            case "january":
                System.out.println("31 Days in January");
                break;
            case "february":
                System.out.println("28/29 Days in February");
                break;
            case "march":
                System.out.println("31 Days in March");
                break;
            case "april":
                System.out.println("30 Days in April");
                break;
            case "may":
                System.out.println("31 Days in May");
                break;
            case "june":
                System.out.println("30 Days in June");
                break;
            case "july":
                System.out.println("31 Days in July");
                break;
            case "august":
                System.out.println("31 Days in August");
                break;
            case "september":
                System.out.println("30 Days in September");
                break;
            case "october":
                System.out.println("31 Days in October");
                break;
            case "november":
                System.out.println("30 Days in November");
                break;
            case "december":
                System.out.println("31 Days in December");
            default:
                System.out.println("Please enter a month");

        }
    }
}
