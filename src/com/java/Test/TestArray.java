package com.java.Test;

import java.util.Arrays;

public class TestArray implements Runnable{
    //make an array

    //random destribution on an array
    public int[][] createArray(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i+1];
            for(int j = 0; j <arr[i].length; j++){
                arr[i][j] = arr[i].length -j;
            }
        }
        return arr;
    }
    //print array
    public void printIntArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public void printStrArr(String[][] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    //random destribution
    public int rand(int n){
        int rand = 0;
            int lower = (int)(((Math.random()*n/2)+0));
            int upper = (int)(((Math.random()*n/2)+n/2));
            int range = Math.abs(upper-lower);
        rand = (int)(Math.random() * range) + lower;

        return rand;
    }
    public String[][] randArray(int size){
        String[][] arr = new String[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j< size; j++){
                arr[i][j] = "__";
            }
        }
        for(int i = 0; i<625; i++){
            arr[rand(size)][rand(size)] = "@@";
        }
        return arr;
    }
    public static void main(String[] args) {
        //starting a thread in a class that implements Runnable
        TestArray testArray = new TestArray();
        Thread thread = new Thread(testArray);
        thread.start();
    }
    @Override
    public void run() {
        TestArray thread = new TestArray();
        thread.printStrArr(thread.randArray(35));
    }
}
