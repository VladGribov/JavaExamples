package com.java.homework;

import java.util.*;

public class Homework15 {
    /**
     * ================= Homework ===============
     * Find divisor of given number (Input - 6, output will be 1 2 3 6)
     * Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
     */
    //find div
    public List<Integer> findDivisors(int n) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                newList.add(i);
            }
        }
        return newList;
    }
    //series
    public int series(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            if(i%3==0){
                i *=-1;
            }
            sum +=i;
            i = Math.abs(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Homework15 hw = new Homework15();
        System.out.println(hw.findDivisors(6));
        System.out.println(hw.series(10));
    }
}
