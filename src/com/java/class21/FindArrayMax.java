package com.java.class21;

public class FindArrayMax {
    public int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data = {35,33,75,43,23,67};
        System.out.println(new FindArrayMax().max(data));
    }
}
