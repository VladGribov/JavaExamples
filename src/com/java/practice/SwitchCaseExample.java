package com.java.practice;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
        int sum = 0;
        String negative = "";
        while(true){
            if(num>=0){
                num = sc.nextInt();
                sum += num;
                count++;
                negative = "positive";
            }else{
                negative = "negative";
                break;
            }
        }
    }
}
