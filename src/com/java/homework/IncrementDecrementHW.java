package com.java.homework;

public class IncrementDecrementHW {
    public static void main(String[] args) {
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
