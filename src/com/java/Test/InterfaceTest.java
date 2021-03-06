package com.java.Test;

import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
    void find_prime(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
@Override
    public int divisor_sum(int n){
        int num = 0;
        for(int i = n; i>0; i--){
            if(n%i == 0){
                num +=i;
            }
        }
        return num;
    }
    //print out prime numbers below the inputted value
    @Override
    public void find_prime(int n){
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
}
public class InterfaceTest {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        calc.find_prime(500000);
    }
}
