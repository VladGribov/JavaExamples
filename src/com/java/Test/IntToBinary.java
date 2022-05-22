package com.java.Test;

import java.util.Arrays;

public class IntToBinary {
    public int[] getBinary(int decimal){
        int count = 0;
        int dec1 = decimal;
        while(dec1 > 1){
            dec1 /= 2;
            count++;
        }
        int[] arr = new int[count+1];
        int div = 1;
        for(int i = 0; i < count; i++){
            div = div*2;
        }
        for(int i = 0; i <= count; i++){
            int place = decimal / div;
            if(place ==1){
                decimal -= div;
            }
            div /=2;
            arr[i] = place;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntToBinary().getBinary(300)));
    }
}
