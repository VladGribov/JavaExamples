package com.java.homework;

public class Homework09 {
    public static void main(String[] args) {
        /*
        int i = 4, j = 4, k = 4;
        int m = i++ + j-- + --k; //11
        //i5
        //j3
        //k3
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
         */
        /*
        int i = 4, j = 4, k = 4;
        int m = ++i + ++j + --k;//13
        //i5
        //j5
        //k3

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
         */
        /*
        int i = 4, j = 4, k = 4;

        i = j++ + --k; //i:4+3=7
        //j:5
        //k:3

        int m = i + j + k;
        //m:15

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
         */
        int i = 4, j = 4, k = 4;
        i=j++;//i:4
        //j:5
        j=k++;//j:4
        //k:5
        k=--i;//k:3
        //i:3
        //j:4
        //k:3
        int m = i + j + k--;//3+4+3
        //i:3
        //j:4
        //k:2
        //m:10
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
