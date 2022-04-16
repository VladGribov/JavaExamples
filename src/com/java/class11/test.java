package com.java.class11;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int i=1;
        int x=0;
        while(i<=limit){
            if(i%2==0){
                x = i/2;
                System.out.println(x);
            } else {
                System.out.println(10-x);
            }
            i++;
        }
    }
}
