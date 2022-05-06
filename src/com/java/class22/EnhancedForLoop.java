package com.java.class22;

import java.util.Arrays;

public class EnhancedForLoop {
    public int sum(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum;
    }

    //Calculate the Average of Array Elements
    public int average(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        return sum / arr.length;
    }

    //maximum number from an array
    public int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int s : arr) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public int missingNumber(int[] arr) {
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arrNew.length; i++) {
            arrNew[i] = i + 1;
        }
        for (int i = 0; i < arrNew.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arrNew[i] == arr[j]) {
                    found = true;
                    break;
                }
                if(arrNew[i] == arrNew[arrNew.length-1]){
                    System.out.println("None missing");
                    return 0;
                }
            }
            if (!found) {
                return arrNew[i];
            }
        }
        return 0;
    }
    public void printArr(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EnhancedForLoop hw = new EnhancedForLoop();
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11};
        int[] arr1 = {1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] arr3 = {1, 3, 4, 5, 6, 7, 8, 10, 9, 11};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11};
        System.out.println(hw.missingNumber(arr));
        System.out.println(hw.missingNumber(arr1));
        System.out.println(hw.missingNumber(arr2));
        System.out.println(hw.missingNumber(arr3));
        System.out.println(hw.missingNumber(arr4));
        int[][] arr5 ={{0,1,2},{0,1,2}};
        System.out.println(arr5[0].length);*/

        int nums[][] = {{1, 2, 3}, {5, 4, 2}, {5, 7, 1}, {4, 2, 1}};
        hw.printArr(nums);
    }
}
