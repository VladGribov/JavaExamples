package com.java.practice;

import java.util.*;
public class IteratorExample {

    public void iterateArray(int[] a){
        Iterator<Integer> iterate = Arrays.stream(a).iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        new IteratorExample().iterateArray(arr);
    }
}
