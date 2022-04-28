package com.java.class20;

import java.util.Arrays;

public class PrintNumber {
    public void num(int n){
        int count = 0;
        int temp = n;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        //print out
        for(int i = 0; i < count; i++){
            arr[i] = n%10;
            n = n/10;
        }
        System.out.println(Arrays.toString(arr));
        for(int i = count -1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public void num2(int n){
        int temp = 0;
        while(n>0){
            temp += n%10;
            n /= 10;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        new PrintNumber().num2(1000000003);
    }
}
