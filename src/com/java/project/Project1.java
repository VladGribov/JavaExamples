package com.java.project;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

            /**
             *
             *  Write a program that calculates multiplication of a 2 digit number by 11 WITHOUT multiplying
             *  Tasks:
             *  1) have a "2 digit number" scanner input
             *  2) get first digit of a number and save
             *  3) get second digit of a number and save
             *  4) sum of first and second digit and save
             *  see Hint for steps 5-6
             *  5) if the sum is a two digit then
             *  6) increment first digit by 1 and save second digit to the sum
             *  7) append first digit, append sum and append second digit (ex: firstDigit = 6
             *  8) print out the result.
             *  HINT:
             *  on steps 5-6 use if statement
             *  syntax:
             *  if ( sum > 9 ) { firstDigit++; sum = sum % 10; }
             *
             *
             *  Example output:
             *   Enter a two digit number I will calculate a multiplication by 11 without multiplying:
             *   56
             *   The result is 616
             *
             */
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number");
            int num = sc.nextInt();
            int dig1 = num / 10;
            int dig2 = num % 10;
            int sum = dig1 + dig2;
            if(sum > 9){
                dig1++;
                sum = sum % 10;
            }
            String temp = "" + dig1 + sum + dig2;
            int result = Integer.parseInt(temp);
            System.out.println(num + " * 11 = " + result);



    }
}
