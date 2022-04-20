package com.java.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework16 {
    public List<Integer> find_prime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int x = 2; x <= i - 1; x++) {
                if (i % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Homework16 hw = new Homework16();
        System.out.println(hw.find_prime(50));
    }
}
