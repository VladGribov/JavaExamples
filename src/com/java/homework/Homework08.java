package com.java.homework;

import java.util.Scanner;

public class Homework08 {
    /*
    If marks are from 90 to 100 Print A
If marks are from 80 to 89 Print B
If marks are from 70 to 79 Print C
If marks are from 60 to 69 Print D
If marks are from 50 to 59 Print E
If marks are from 0 to 49 Print Fail
     */
    static void a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int mark = sc.nextInt();
        if(mark >= 90 && mark <= 100){
            System.out.println("You get an A");
        }else if(mark >= 80 && mark <= 89){
            System.out.println("You get a B");
        }else if(mark >= 70 && mark <= 79){
            System.out.println("You get a C");
        }else if(mark >= 60 && mark <= 69){
            System.out.println("You get a D");
        }else if(mark >= 50 && mark <= 59){
            System.out.println("You get an E");
        }else if(mark < 50){
            System.out.println("You fail");
        }
    }
    //-------------------------------------------------
    /*
    If inches is 27 to 30 Print XS
If inches is 31 to 34 Print S
If inches is 35 to 38 Print L
If inches is 39 to 42 Print XL
If inches is 45 to 50 Print XXL
     */
    static void b(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter T-Shirt size:");
        int size = sc.nextInt();
        if(size>=27 && size <= 30){
            System.out.println("Size: XS");
        }else if(size>=31 && size <= 34){
            System.out.println("Size: S");
        }else if(size>=35 && size <= 38){
            System.out.println("Size: L");
        }else if(size>=39 && size <= 45){
            System.out.println("Size: XL");
        }else if(size>=45 && size <= 50){
            System.out.println("Size: XXL");
        }else if(size<27){
            System.out.println("Size: Tiny");
        }else{
            System.out.println("Size: Huge");
        }
    }
    /*
    Write a program to take number from user and check if it's divisible by 5 or 3
     */
    static void c(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 5 == 0 && num % 3 == 0){
            System.out.println("Number divisible by both 5 and 3");
        }else if(num % 5 == 0){
            System.out.println("Number divisible by 5");
        }else if(num % 3 == 0){
            System.out.println("Number divisible by 3");
        }else{
            System.out.println("Number not divisible by 5 or 3");
        }
    }
    public static void main(String[] args) {
        c();
    }
}
