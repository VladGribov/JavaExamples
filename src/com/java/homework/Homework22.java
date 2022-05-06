package com.java.homework;

public class Homework22 {
    //Find sum of Individual row in 2D array
    public void sum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+ " is: " + sum);
        }
    }
    //Find the Transpose of Matrix (interchanging its rows into columns or columns into rows)
    public void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Homework22 hw = new Homework22();
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        hw.sum(arr);
        System.out.println();
        hw.transpose(arr);
    }
}
