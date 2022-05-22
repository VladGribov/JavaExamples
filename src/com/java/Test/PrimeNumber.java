package com.java.Test;

import com.java.class20.PrintNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {
    public void findPrime(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for (int i = 3; i <= n; i++) {
            boolean isPrime = true;
            if ((i & 1) == 1) {
                for (int j = i - 1; j >= Math.sqrt(i); j--) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        new PrimeNumber().findPrime(100);
    }
}
