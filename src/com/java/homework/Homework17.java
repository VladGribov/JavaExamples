package com.java.homework;

import com.java.practice.PracticeMethods;

public class Homework17 {
    //Write a program to print all numbers from 1 to 50 which has more than 5 divisor
    public void div5() {
        for (int i = 1; i <= 50; i++) {
            int divCount = 0;
            for (int x = 1; x <= i; x++) {
                if (i % x == 0) {
                    divCount++;
                }
                if (divCount > 5) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
    //Write a program to print all even numbers which are divisible by 6 from 1 to 50
    public void divBy6(){
        for(int i = 1; i<=50; i++){
            if(i % 6 == 0){ //anything divisible by 6 is even
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        new Homework17().div5();
        System.out.println();
        new Homework17().divBy6();
    }
}
