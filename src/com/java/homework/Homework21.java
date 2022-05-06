package com.java.homework;

import java.util.Arrays;

public class Homework21 {
    //sum Of Array Elements
    public int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //Calculate the Average of Array Elements
    public int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    //Find index of a given number
    public int[] findIndex(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        int index = 0;
        int[] newArr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                newArr[index] = i;
                index++;
            }
        }
        return newArr;
    }

    //maximum number from an array
    public int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Homework21 hw = new Homework21();
        int[] arr = {-5, 6, 4, 3, 2};
        System.out.println(hw.sum(arr));
        System.out.println(hw.average(arr));
        System.out.println(hw.max(arr));
        System.out.println(Arrays.toString(hw.findIndex(arr, 4)));

        int[] arr1 = {-5, 6, 4, 3, 2, 4, 20, 56, 23948, 4, 2, 3, 4, 1,0};
        System.out.println(Arrays.toString(hw.findIndex(arr1, 4)));
    }
}












