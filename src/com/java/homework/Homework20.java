package com.java.homework;

public class Homework20 {
    public int reverse(int n){
        int rev = 0;
        while(Math.abs(n)>0){
            if (rev > Integer.MAX_VALUE / 10) {
                System.out.println("Reversed Value too large");
                return 0;
            } else if (rev < Integer.MIN_VALUE / 10) {
                System.out.println("Reversed Value too small");
                return 0;
            }
            rev = rev*10 + n%10;
            n=n/10;
        }
        return rev;
    }
    public boolean palindrome(int n){
        int rev = reverse(n);
        if(rev == n){
            return true;
        } else {
            return false;
        }
    }
    //Write a program to find maximum digit from the given number
    public int max(int n){
        int max = Integer.MIN_VALUE;
        while(Math.abs(n)>0){
            int lp = n%10;
            if(lp > max){
                max = lp;
            }
            n/=10;
        }
        return max;
    }
    //Write a program to Count Number of Digit
    public int countDigit(int n){
        int count = 0;
        while(Math.abs(n)>0){
            n/=10;
            count++;
        }
        return count;
    }
    //max
    public static void main(String[] args) {
        System.out.println(new Homework20().max(-123456789));
    }
}
