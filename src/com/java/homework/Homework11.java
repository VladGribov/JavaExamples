package com.java.homework;
import java.util.*;
public class Homework11 {
    //return multiples of the imputed number
    public static void problem1(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Limit:");
       int limit = sc.nextInt();
        System.out.println("Enter Number:");
        int mult = sc.nextInt();
        int i = 1;
        while(i<=limit/mult){
            System.out.println(i*mult);
            i++;
        }
    }
    //Write a program to print numbers that are divisible by 3 and 5 from 1 to 50
    public static void problem2(){
        int i = 1;
        while(i<=50){
            if(i%3 == 0 || i%5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }


    //Write a program to print numbers that are not divisible by 3 and divisible by 7
    public static void problem3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int limit = sc.nextInt();
        int i = 1;
        while(i<=limit){
            if(!(i%3==0) && i%7==0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        problem3();
    }
}
