package com.java.Test;

import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
    List<Integer> find_prime(int n);
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
    public List<Integer> find_prime(int n){
        List<Integer> list = new ArrayList<Integer>();
        //check each number individually
        //prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
        for(int i=2; i<=n; i++){
            //2nd loop
            boolean isPrime = true;
            for(int x = 2; x<=i-1; x++){
                if(i%x==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
    return list;
    }


}
public class InterfaceTest {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        System.out.println(calc.find_prime(600000));
    }
}
